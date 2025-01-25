package consulo.cocos.module.meta;

import com.google.gson.stream.JsonReader;
import consulo.annotation.component.ExtensionImpl;
import consulo.application.Application;
import consulo.gameFramework.meta.MetadataFileTypeDetector;
import consulo.util.io.ByteSequence;
import consulo.util.io.CharSequenceReader;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.inject.Inject;

/**
 * @author VISTALL
 * @since 2025-01-25
 */
@ExtensionImpl
public class CocosMetadataFileTypeDetector extends MetadataFileTypeDetector {
    @Inject
    public CocosMetadataFileTypeDetector(@Nonnull Application application) {
        super(application, CocosMetadataProvider.class, "dummy-due-checkContent-overrided");
    }

    @Override
    protected boolean checkContent(@Nonnull ByteSequence firstBytes, @Nullable CharSequence firstCharsIfText) {
        if (firstCharsIfText == null) {
            return false;
        }

        try {
            JsonReader parser = new JsonReader(new CharSequenceReader(firstCharsIfText));
            parser.beginObject();
            String ver = parser.nextName();
            parser.nextString();
            String uuid = parser.nextName();
            parser.nextString();

            return "ver".equals(ver) && "uuid".equals(uuid);
        }
        catch (Exception ignored) {
            return false;
        }
    }

    @Override
    public int getDesiredContentPrefixLength() {
        return 256;
    }
}

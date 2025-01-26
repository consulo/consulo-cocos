package consulo.cocos.module.asset;

import com.google.gson.stream.JsonReader;
import consulo.annotation.component.ExtensionImpl;

import java.util.Set;

/**
 * @author VISTALL
 * @since 2025-01-26
 */
@ExtensionImpl(order = "before unity")
public class CocosObjectAssetFileTypeDetector extends CocosAssetFileTypeDetector {
    private static final Set<String> TYPES = Set.of("cc.Material");

    private static final Set<String> ALLOWED_EXTENSIONS = Set.of("mtl");

    @Override
    public Set<String> getAllowedExtensions() {
        return ALLOWED_EXTENSIONS;
    }

    @Override
    protected boolean testFile(JsonReader reader) throws Exception {
        reader.beginObject();

        String fieldName = reader.nextName();
        String fieldValue = reader.nextString();
        return "__type__".equals(fieldName) && TYPES.contains(fieldValue);
    }
}

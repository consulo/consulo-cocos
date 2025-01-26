package consulo.cocos.module.asset;

import com.google.gson.stream.JsonReader;
import consulo.util.io.ByteSequence;
import consulo.util.io.CharSequenceReader;
import consulo.virtualFileSystem.VirtualFile;
import consulo.virtualFileSystem.fileType.FileType;
import consulo.virtualFileSystem.fileType.FileTypeDetector;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.util.Collection;
import java.util.Set;

/**
 * @author VISTALL
 * @since 2025-01-26
 */
public abstract class CocosAssetFileTypeDetector implements FileTypeDetector {
    @Nullable
    @Override
    public FileType detect(@Nonnull VirtualFile virtualFile, @Nonnull ByteSequence byteSequence, @Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }

        String extension = virtualFile.getExtension();
        if (extension == null || !getAllowedExtensions().contains(extension)) {
            return null;
        }

        try {
            JsonReader parser = new JsonReader(new CharSequenceReader(charSequence));

            return testFile(parser) ? CocosAssetFileType.INSTANCE : null;
        }
        catch (Exception ignored) {
        }

        return null;
    }

    protected abstract boolean testFile(JsonReader reader) throws Exception;

    protected abstract Set<String> getAllowedExtensions();

    @Nullable
    @Override
    public Collection<? extends FileType> getDetectedFileTypes() {
        return Set.of(CocosAssetFileType.INSTANCE);
    }

    @Override
    public int getVersion() {
        return 4;
    }

    @Override
    public int getDesiredContentPrefixLength() {
        return 256;
    }
}

package consulo.cocos.module.asset;

import consulo.annotation.component.ExtensionImpl;
import consulo.virtualFileSystem.fileType.FileTypeConsumer;
import consulo.virtualFileSystem.fileType.FileTypeFactory;
import jakarta.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 2025-01-26
 */
@ExtensionImpl
public class CocosAssetFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@Nonnull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(CocosAssetFileType.INSTANCE);
    }
}

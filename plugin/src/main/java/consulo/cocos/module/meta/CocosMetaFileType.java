package consulo.cocos.module.meta;

import com.intellij.json.JsonLanguage;
import consulo.gameFramework.icon.GameFrameworkIconGroup;
import consulo.gameFramework.meta.MetadataFileType;
import consulo.language.file.LanguageFileType;
import consulo.localize.LocalizeValue;
import consulo.ui.image.Image;
import jakarta.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 2025-01-25
 */
public class CocosMetaFileType extends LanguageFileType implements MetadataFileType {
    public static final CocosMetaFileType INSTANCE = new CocosMetaFileType();

    private CocosMetaFileType() {
        super(JsonLanguage.INSTANCE);
    }

    @Nonnull
    @Override
    public String getId() {
        return "COCOS_META";
    }

    @Nonnull
    @Override
    public LocalizeValue getDescription() {
        return LocalizeValue.localizeTODO("Cocos Meta Files");
    }

    @Nonnull
    @Override
    public Image getIcon() {
        return GameFrameworkIconGroup.metadatafile();
    }
}

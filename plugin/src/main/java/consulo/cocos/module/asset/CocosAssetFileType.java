package consulo.cocos.module.asset;

import com.intellij.json.JsonLanguage;
import consulo.gameFramework.icon.GameFrameworkIconGroup;
import consulo.language.file.LanguageFileType;
import consulo.localize.LocalizeValue;
import consulo.ui.image.Image;
import jakarta.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 2025-01-26
 */
public class CocosAssetFileType extends LanguageFileType {
    public static final CocosAssetFileType INSTANCE = new CocosAssetFileType();

    private CocosAssetFileType() {
        super(JsonLanguage.INSTANCE);
    }

    @Nonnull
    @Override
    public String getId() {
        return "COCOS_ASSET";
    }

    @Nonnull
    @Override
    public LocalizeValue getDescription() {
        return LocalizeValue.localizeTODO("Cocos Asset Files");
    }

    @Nonnull
    @Override
    public Image getIcon() {
        return GameFrameworkIconGroup.prefabfile();
    }
}

package consulo.cocos.module.asset;

import consulo.annotation.access.RequiredReadAction;
import consulo.gameFramework.icon.GameFrameworkIconGroup;
import consulo.javascript.language.JavaScriptFileTypeWithVersion;
import consulo.javascript.language.JavaScriptLanguage;
import consulo.json.lang.JsonJavaScriptVersion;
import consulo.language.file.LanguageFileType;
import consulo.language.version.LanguageVersion;
import consulo.localize.LocalizeValue;
import consulo.module.Module;
import consulo.ui.image.Image;
import consulo.virtualFileSystem.VirtualFile;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2025-01-26
 */
public class CocosAssetFileType extends LanguageFileType implements JavaScriptFileTypeWithVersion {
    public static final CocosAssetFileType INSTANCE = new CocosAssetFileType();

    private CocosAssetFileType() {
        super(JavaScriptLanguage.INSTANCE);
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

    @RequiredReadAction
    @Nonnull
    @Override
    public LanguageVersion getLanguageVersion(@Nullable Module module, @Nullable VirtualFile virtualFile) {
        return JsonJavaScriptVersion.getInstance();
    }
}

package consulo.cocos.module.meta;

import consulo.annotation.access.RequiredReadAction;
import consulo.gameFramework.icon.GameFrameworkIconGroup;
import consulo.gameFramework.meta.MetadataFileType;
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
 * @since 2025-01-25
 */
public class CocosMetaFileType extends LanguageFileType implements MetadataFileType, JavaScriptFileTypeWithVersion {
    public static final CocosMetaFileType INSTANCE = new CocosMetaFileType();

    private CocosMetaFileType() {
        super(JavaScriptLanguage.INSTANCE);
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

    @RequiredReadAction
    @Nonnull
    @Override
    public LanguageVersion getLanguageVersion(@Nullable Module module, @Nullable VirtualFile virtualFile) {
        return JsonJavaScriptVersion.getInstance();
    }
}

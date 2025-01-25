package consulo.cocos.module.meta;

import consulo.annotation.access.RequiredReadAction;
import consulo.annotation.component.ExtensionImpl;
import consulo.cocos.module.extension.CocosModuleExtension;
import consulo.gameFramework.meta.MetadataFileType;
import consulo.gameFramework.meta.MetadataProvider;
import consulo.language.psi.PsiFile;
import consulo.language.psi.stub.PsiDependentFileContent;
import consulo.module.extension.ModuleExtensionHelper;
import consulo.project.Project;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2025-01-25
 */
@ExtensionImpl
public class CocosMetadataProvider implements MetadataProvider {
    @Nonnull
    @Override
    public String getExtension() {
        return "meta";
    }

    @RequiredReadAction
    @Override
    public boolean isAvailable(@Nonnull Project project) {
        return ModuleExtensionHelper.getInstance(project).hasModuleExtension(CocosModuleExtension.class);
    }

    @RequiredReadAction
    @Nullable
    @Override
    public String extractIdForIndex(@Nonnull PsiDependentFileContent psiDependentFileContent) {
        return null;
    }

    @RequiredReadAction
    @Nullable
    @Override
    public String extractId(@Nonnull PsiFile psiFile) {
        return null;
    }

    @Nonnull
    @Override
    public MetadataFileType getFileType() {
        return CocosMetaFileType.INSTANCE;
    }

    @Override
    public int getVersion() {
        return 5;
    }
}

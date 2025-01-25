package consulo.cocos.module.extension;

import consulo.content.bundle.Sdk;
import consulo.content.bundle.SdkType;
import consulo.javascript.module.extension.JavaScriptModuleExtension;
import consulo.language.version.LanguageVersion;
import consulo.module.Module;
import consulo.module.content.layer.ModuleRootLayer;
import consulo.module.content.layer.extension.ModuleExtensionBase;
import consulo.module.extension.ModuleInheritableNamedPointer;
import consulo.typescript.version.TypeScriptLanguageVersion;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2025-01-23
 */
public class CocosModuleExtension extends ModuleExtensionBase<CocosModuleExtension> implements JavaScriptModuleExtension<CocosModuleExtension> {
    private final ModuleInheritableNamedPointer<Sdk> myDummyPointer = new ModuleInheritableNamedPointer<Sdk>() {
        @Nullable
        @Override
        public Module getModule() {
            return null;
        }

        @Nullable
        @Override
        public String getModuleName() {
            return null;
        }

        @Override
        public boolean isNull() {
            return true;
        }

        @Nonnull
        @Override
        public String getName() {
            return "";
        }

        @Nullable
        @Override
        public Sdk get() {
            return null;
        }
    };

    public CocosModuleExtension(@Nonnull String id, @Nonnull ModuleRootLayer moduleRootLayer) {
        super(id, moduleRootLayer);
    }

    @Nonnull
    @Override
    public LanguageVersion getLanguageVersion() {
        return TypeScriptLanguageVersion.getInstance();
    }

    @Nonnull
    @Override
    public ModuleInheritableNamedPointer<Sdk> getInheritableSdk() {
        return myDummyPointer;
    }

    @Nullable
    @Override
    public Sdk getSdk() {
        return null;
    }

    @Nullable
    @Override
    public String getSdkName() {
        return null;
    }

    @Nonnull
    @Override
    public Class<? extends SdkType> getSdkTypeClass() {
        return SdkType.class;
    }
}

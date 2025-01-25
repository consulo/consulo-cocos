package consulo.cocos.module.extension;

import consulo.annotation.component.ExtensionImpl;
import consulo.cocos.icon.CocosIconGroup;
import consulo.cocos.localize.CocosLocalize;
import consulo.localize.LocalizeValue;
import consulo.module.content.layer.ModuleExtensionProvider;
import consulo.module.content.layer.ModuleRootLayer;
import consulo.module.extension.ModuleExtension;
import consulo.module.extension.MutableModuleExtension;
import consulo.ui.image.Image;
import jakarta.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 2025-01-23
 */
@ExtensionImpl
public class CocosModuleExtensionProvider implements ModuleExtensionProvider<CocosModuleExtension> {
    @Nonnull
    @Override
    public String getId() {
        return "cocos";
    }

    @Nonnull
    @Override
    public LocalizeValue getName() {
        return CocosLocalize.cocosName();
    }

    @Nonnull
    @Override
    public Image getIcon() {
        return CocosIconGroup.cocos();
    }

    @Nonnull
    @Override
    public ModuleExtension<CocosModuleExtension> createImmutableExtension(@Nonnull ModuleRootLayer moduleRootLayer) {
        return new CocosModuleExtension(getId(), moduleRootLayer);
    }

    @Nonnull
    @Override
    public MutableModuleExtension<CocosModuleExtension> createMutableExtension(@Nonnull ModuleRootLayer moduleRootLayer) {
        return new CocosMutableModuleExtension(getId(), moduleRootLayer);
    }
}

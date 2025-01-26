package consulo.cocos.module.asset;

import com.google.gson.stream.JsonReader;
import consulo.annotation.component.ExtensionImpl;

import java.util.Set;

/**
 * @author VISTALL
 * @since 2025-01-26
 */
@ExtensionImpl(order = "before unity")
public class CocosArrayAssetFileTypeDetector extends CocosAssetFileTypeDetector {
    private static final Set<String> TYPES = Set.of("cc.Prefab", "cc.SceneAsset");

    private static final Set<String> ALLOWED_EXTENSIONS = Set.of("prefab", "fire");

    @Override
    protected boolean testFile(JsonReader reader) throws Exception {
        reader.beginArray();
        reader.beginObject();

        String fieldName = reader.nextName();
        String fieldValue = reader.nextString();
        return "__type__".equals(fieldName) && TYPES.contains(fieldValue);
    }

    @Override
    public Set<String> getAllowedExtensions() {
        return ALLOWED_EXTENSIONS;
    }
}

/**
 * @author VISTALL
 * @since 24/01/2023
 */
module consulo.simple.plugin {
    requires consulo.ide.api;

    requires consulo.javascript.base.api;
    requires consulo.javascript.typescript.impl;
    requires consulo.game.framework.api;
    requires consulo.javascript.json.javascript.impl;

    requires com.google.gson;
}
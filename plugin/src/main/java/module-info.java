/**
 * @author VISTALL
 * @since 24/01/2023
 */
module consulo.simple.plugin {
    requires consulo.application.api;
    requires consulo.application.content.api;
    requires consulo.disposer.api;
    requires consulo.language.api;
    requires consulo.localize.api;
    requires consulo.module.api;
    requires consulo.module.content.api;
    requires consulo.project.api;
    requires consulo.ui.api;
    requires consulo.util.io;
    requires consulo.virtual.file.system.api;

    requires consulo.json.api;

    requires consulo.javascript.base.api;
    requires consulo.javascript.typescript.impl;
    requires consulo.game.framework.api;

    requires com.google.gson;
}

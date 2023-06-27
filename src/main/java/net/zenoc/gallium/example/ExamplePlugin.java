package net.zenoc.gallium.example;

import net.zenoc.gallium.Gallium;
import net.zenoc.gallium.api.annotations.PluginLifecycleListener;
import net.zenoc.gallium.example.commands.TestCommand;
import net.zenoc.gallium.plugin.PluginLifecycleState;
import net.zenoc.gallium.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {
    @PluginLifecycleListener(PluginLifecycleState.ENABLED)
    public void onPluginEnabled() {
        Gallium.getCommandManager().registerCommand(new TestCommand(), this);
    }
}

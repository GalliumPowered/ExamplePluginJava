package org.galliumpowered.example;

import com.google.inject.Inject;
import org.galliumpowered.Gallium;
import org.galliumpowered.annotation.PluginLifecycleListener;
import org.galliumpowered.example.commands.ExampleCommand;
import org.galliumpowered.plugin.PluginContainer;
import org.galliumpowered.plugin.PluginLifecycleState;

public class ExamplePlugin {
    @Inject
    private PluginContainer pluginContainer;
    @PluginLifecycleListener(PluginLifecycleState.ENABLED)
    public void onPluginEnabled() {
        Gallium.getCommandManager().registerCommand(new ExampleCommand(), pluginContainer);
    }
}

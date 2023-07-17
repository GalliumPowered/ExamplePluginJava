package org.galliumpowered.example;

import com.google.inject.Inject;
import org.galliumpowered.Gallium;
import org.galliumpowered.annotation.PluginLifecycleListener;
import org.galliumpowered.command.PluginCommandManager;
import org.galliumpowered.example.commands.TestCommand;
import org.galliumpowered.plugin.PluginLifecycleState;

public class ExamplePlugin {
    @Inject
    private PluginCommandManager commandManager;
    @PluginLifecycleListener(PluginLifecycleState.ENABLED)
    public void onPluginEnabled() {
        commandManager.registerCommand(new TestCommand());
    }
}

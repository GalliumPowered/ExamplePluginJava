package org.galliumpowered.example.commands;

import net.kyori.adventure.text.Component;
import org.galliumpowered.annotation.Command;
import org.galliumpowered.command.CommandContext;

public class TestCommand {
    @Command(aliases = {"test"}, description = "An example command")
    public void testCommand(CommandContext ctx) {
        ctx.getCaller().sendMessage(Component.text("Hello there, you used the test command!"));
    }
}

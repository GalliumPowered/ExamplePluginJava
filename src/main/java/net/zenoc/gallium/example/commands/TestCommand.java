package net.zenoc.gallium.example.commands;

import net.zenoc.gallium.api.annotations.Command;
import net.zenoc.gallium.api.chat.ChatMessage;
import net.zenoc.gallium.commandsys.CommandContext;

public class TestCommand {
    @Command(aliases = {"test"}, description = "An example command")
    public void testCommand(CommandContext ctx) {
        ctx.getCaller().sendMessage(ChatMessage.from("Hello there, you used the test command!"));
    }
}

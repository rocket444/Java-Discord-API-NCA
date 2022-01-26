package main;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {

    private static final String BOT_TOKEN = "";

    public static void main(String[] args) throws LoginException {
        JDABuilder.createDefault(BOT_TOKEN)
                .setActivity(Activity.listening("Meetcetera"))
                .addEventListeners(new Main())
                .setMemberCachePolicy(MemberCachePolicy.ALL)
                .enableIntents(GatewayIntent.getIntents(GatewayIntent.ALL_INTENTS))
                .setRawEventsEnabled(true)
                .build();
    }

    /**
     * Calls Function automatically when message is written in text channel
     *
     * @param event the Message received event
     *
     * Tasks:
     * Create a single word command that sends a message in the same text channel.
     * Add a Reaction to the newly created message.
     */
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        System.out.println(event.getMessage().getContentRaw());
    }


    /**
     * Calls Function automatically when a reaction is added to a message
     *
     * @param event the message reaction event
     *
     * Tasks:
     * React to the reaction which was added but only if it was a message sent by a bot.
     * The reaction can be in form of another reaction, reply or editing the message the reaction was added to.
     * Additionally you can give the member that reacted a role. You can create a role in the options of your discord server.
     *              You can either search a role with the name or ID.
     */
    @Override
    public void onMessageReactionAdd(@NotNull MessageReactionAddEvent event) {

    }

    /**
     * Calls Function automatically when the bot joins a new guild
     *
     * @param event the join event
     *
     * Tasks:
     * Create a message which will be sent when the bot joins the guild, think of it like a short introduction.
     * Once you successfully created the message, kick your bot out your server and invite him again through the generated URL.
     */
    @Override
    public void onGuildJoin(@NotNull GuildJoinEvent event){

    }

    /**
     * Calls Function automatically when a new member joins the Guild
     *
     * @param event the join event
     *
     * Tasks:
     * Create a welcome message for our new user.
     * Once you created the message sent a invitation to someone. You can sent it in the meeting channel or privat to someone.
     */
    @Override
    public void onGuildMemberJoin(@NotNull GuildMemberJoinEvent event) {

    }
}

package main;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
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
     */
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        System.out.println(event.getMessage().getContentRaw());
    }
}

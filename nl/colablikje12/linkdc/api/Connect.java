package nl.colablikje12.linkdc.api;

import club.minnced.discord.webhook.send.WebhookEmbed;
import club.minnced.discord.webhook.send.WebhookEmbedBuilder;
import club.minnced.discord.webhook.send.WebhookMessage;
import club.minnced.discord.webhook.send.WebhookMessageBuilder;

public class Connect {

    String username;
    String avatarURL;

    public WebhookEmbed buildEmbed() {



        WebhookEmbedBuilder builder = new WebhookEmbedBuilder();
        builder.setColor(0x4896a2);

        builder.addField(new WebhookEmbed.EmbedField(false, "Bericht: ", "Dit is het bericht" ));

        return builder.build();
    }

    public WebhookMessage buildMessage() {
        WebhookMessageBuilder builder = new WebhookMessageBuilder();
        builder.addEmbeds(buildEmbed());
        builder.setAvatarUrl("https://i.paradaux.io/i/4vvj9.png");
        builder.setUsername("colablikje12");

        return builder.build();
    }

}

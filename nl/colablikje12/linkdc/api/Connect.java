package nl.colablikje12.linkdc.api;

import club.minnced.discord.webhook.send.WebhookEmbed;
import club.minnced.discord.webhook.send.WebhookEmbedBuilder;
import club.minnced.discord.webhook.send.WebhookMessage;
import club.minnced.discord.webhook.send.WebhookMessageBuilder;

public class Connect {

    String message;
    String avatarUrl;
    String userName;

    public Connect (String message, String avatarUrl, String userName) {
        this.message = message;
        this.avatarUrl = avatarUrl;
        this.userName = userName;
    }

    public WebhookEmbed buildEmbed() {



        WebhookEmbedBuilder builder = new WebhookEmbedBuilder();
        builder.setColor(0x4896a2);

        builder.addField(new WebhookEmbed.EmbedField(false, "Bericht: ", message ));

        return builder.build();
    }

    public WebhookMessage buildMessage() {
        WebhookMessageBuilder builder = new WebhookMessageBuilder();
        builder.addEmbeds(buildEmbed());
        builder.setAvatarUrl(avatarUrl);
        builder.setUsername(userName);

        return builder.build();
    }

}

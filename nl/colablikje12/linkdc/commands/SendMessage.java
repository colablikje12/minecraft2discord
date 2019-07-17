package nl.colablikje12.linkdc.commands;

import club.minnced.discord.webhook.WebhookClient;
import club.minnced.discord.webhook.WebhookClientBuilder;
import nl.colablikje12.linkdc.DCLink;
import nl.colablikje12.linkdc.api.Connect;
import nl.colablikje12.linkdc.config.Config;
import nl.colablikje12.linkdc.utils.Common;
import nl.colablikje12.linkdc.utils.PlayerCommand;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class SendMessage extends PlayerCommand {

    public SendMessage(String name) {
        super("sendmessage");
        setDescription("send a message to discord");
    }

    @Override
    public void run(Player player, String[] args) {

    if (Config.lWebhook == null) {
        Common.tell(player, "&4&lERROR! &fDe webhook heb je niet in je config aangemaakt!");
        return;
    }
        String webhook = Config.lWebhook;

        WebhookClient client = new WebhookClientBuilder(webhook).build();
        Connect c = new Connect();

        Connect test = new Connect();
        Bukkit.getScheduler().runTaskAsynchronously(DCLink.getInstance(), () -> client.send(c.buildMessage()));
        Common.tell(player, "&4Gelukt! &aHet test bericht is succesvol verstuurd!");

    }
}

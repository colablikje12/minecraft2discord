package nl.colablikje12.linkdc;

import nl.colablikje12.linkdc.commands.SendMessage;
import nl.colablikje12.linkdc.config.Config;
import nl.colablikje12.linkdc.utils.Common;
import org.bukkit.plugin.java.JavaPlugin;

public final class DCLink extends JavaPlugin {

    public static DCLink instance;

    @Override
    public void onEnable() {
        instance = this;

        Config.init();

        Common.registerCommand(new SendMessage("test"));


    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static DCLink getInstance() {
        return instance;
    }
}

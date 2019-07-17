package nl.colablikje12.linkdc.config;

public class Config extends SimpleConfig {

    private Config(String fileName) {
        super(fileName);

        setHeader(new String[] {
                "---------------------------------",
                "owhjee, omdat Bukkit kut doet zijn  al je opmerkingen verdwenenen",
                "ga direct naar " + fileName + "om de standaard worden op te slaan",
                "---------------------------------",
        });
    }

    public static String lWebhook;
    public static String lUrl;
    public static String lUsername;


    private void onLoad() {

        lWebhook = getString("link.webhook-url");
        lUrl = getString("link.avatar-url");
        lUsername = getString("link.username");
    }

    public static void init() {
        new Config("config.yml").onLoad();
    }

}

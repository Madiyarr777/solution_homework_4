import java.util.HashMap;
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final HashMap<String, String> configs = new HashMap<>();

    private ConfigurationManager() {

        configs.put("serverCapacity", "200");
        configs.put("themeColor", "dark");
        configs.put("autosaveInterval", "30min");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configs.getOrDefault(key, "Config not found");
    }

    public void printAllConfigs() {
        System.out.println("=== Active Configurations ===");
        configs.forEach((k, v) -> System.out.println(k + " → " + v));
    }
}
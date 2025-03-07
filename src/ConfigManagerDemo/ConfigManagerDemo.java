public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        System.out.println("Server Capacity: " + config.getConfig("serverCapacity"));
        System.out.println("UI Theme: " + config.getConfig("themeColor"));

        config.printAllConfigs();
    }
}
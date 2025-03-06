package part1_Singleton_Pattern;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        // Получаем единственный экземпляр ConfigurationManager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // принтим конкретное значение по ключу из мапа
        System.out.println("maxPlayers: " + configManager.getConfig("maxPlayers"));

        // принтим все настройки
        configManager.printConfigurations();
    }
}

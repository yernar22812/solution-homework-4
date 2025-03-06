package part1_Singleton_Pattern;
import java.util.*;
public class ConfigurationManager {
private static ConfigurationManager instance; // единсвенный экземпляр класса
    private Map<String, String> configSettings; // хранилище

    // извне нельзя создавать обьекты
    private ConfigurationManager() {
        configSettings = new HashMap<>();
        loadConfigurations();
    }
    // ленивая инициализация
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
            return instance;
    }

    // задаем конфигурацию
    private void loadConfigurations() {
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }
    public String getConfig(String key) {
        return configSettings.get(key);
    }
    public void printConfigurations() {
        System.out.println("Configuration Settings:");
        for (Map.Entry<String, String> entry : configSettings.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

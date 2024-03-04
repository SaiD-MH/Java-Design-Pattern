package CreationalPatterns.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {


    Map<String, Object> map = new HashMap<>();


    private static ConfigurationManager instance = new ConfigurationManager();


    private ConfigurationManager() {
    }


    public void add(String s , Object object) {
        map.put(s, object);
    }

    public Object get(String name) {
        return map.get(name);
    }


    public static ConfigurationManager getInstance() {
        return instance;
    }
}

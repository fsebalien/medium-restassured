package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyManager {
    private Map<String, Properties> map = new HashMap<>();
    Map<String, File> files = new HashMap<>();

    public PropertyManager() {
        files.put("pet", new File(ClassLoader.getSystemResource("properties/pet.properties").getPath()));
        files.put("store", new File(ClassLoader.getSystemResource("properties/store.properties").getPath()));

        for (File f : files.values()) {
            Properties props = new Properties();
            try {
                props.load(new FileReader(f));
                map.put(f.getName(), props);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }

    }

    public String getProperty(String file, String key) {
        Properties props = map.get(file);

        if (props != null) {
            return props.getProperty(key);
        }
        return null;
    }
}

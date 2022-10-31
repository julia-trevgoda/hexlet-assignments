package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage {

    private final Map<String, String> dbEntries;

    public InMemoryKV(Map<String, String> dbEntries) {
        this.dbEntries = new HashMap<>(dbEntries);
    }

    @Override
    public void set(String key, String value) {
        dbEntries.put(key, value);
    }

    @Override
    public void unset(String key) {
        dbEntries.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return dbEntries.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(dbEntries);
    }
}
// END

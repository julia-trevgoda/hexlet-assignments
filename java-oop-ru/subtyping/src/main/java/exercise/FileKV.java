package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {

    private final Map<String, String> dbEntries;
    private final String filePath;

    public FileKV(String filePath, Map<String, String> dbEntries) {
        Utils.writeFile(filePath, Utils.serialize(dbEntries));
        this.dbEntries = new HashMap<>(dbEntries);
        this.filePath = filePath;
    }


    @Override
    public void set(String key, String value) {
        dbEntries.put(key, value);
        Utils.writeFile(filePath, Utils.serialize(dbEntries));
    }

    @Override
    public void unset(String key) {
        dbEntries.remove(key);
        Utils.writeFile(filePath, Utils.serialize(dbEntries));
    }

    @Override
    public String get(String key, String defaultValue) {
        return dbEntries.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return Utils.unserialize(Utils.readFile(filePath));
    }
}
// END

package shekhar.tdd.fakes;

import java.util.HashMap;
import java.util.Map;

public class LocationDatabaseFake implements LocationDatabase {
    public Map<String, String> map = new HashMap<>();
    @Override
    public void save(String key, String loc) {
        map.put(key, loc);
    }
    @Override
    public String get(String key) {
        return map.get(key);
    }
}

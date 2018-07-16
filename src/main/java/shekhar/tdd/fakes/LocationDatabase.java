package shekhar.tdd.fakes;

public interface LocationDatabase {
    void save(String key, String loc);
    String get(String key);
}

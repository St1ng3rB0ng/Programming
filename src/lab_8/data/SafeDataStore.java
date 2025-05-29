package lab_8.data;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SafeDataStore {
    private Map<String, String> data = new HashMap<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void put(String key, String value) {
        lock.writeLock().lock(); //only single write thread
        try {
            data.put(key, value);
        } finally {
            lock.writeLock().unlock();
        }

    }

    public String get(String key) {
        lock.readLock().lock();
        try {
            if (!data.containsKey(key)) {
                return "Not found at key: " + key;
            }
            return data.get(key);
        } finally {
            lock.readLock().unlock();
        }
    }
}

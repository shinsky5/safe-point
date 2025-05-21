package com.test.safepoint.database;

import com.test.safepoint.point.User;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class UserTables {
    private final Map<Long, User> store = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public User save(int initialPoint) {
        Long id = idGenerator.getAndIncrement();
        User user = new User(id, initialPoint);
        store.put(id, user);
        return user;
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public void update(Long id, int initialPoint) {
        store.put(id, new User(id, initialPoint));
    }
}

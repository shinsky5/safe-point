package com.test.safepoint.point;

import com.test.safepoint.database.UserTables;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository {
    private final UserTables tables = new UserTables();

    public User save(int init) {
        return tables.save(init);
    }

    public Optional<User> findById(Long id) {
        return tables.findById(id);
    }

    public void update(Long id, int amount) {
        tables.update(id, amount);
    }
}

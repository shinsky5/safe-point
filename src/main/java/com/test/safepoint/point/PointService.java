package com.test.safepoint.point;

import org.springframework.stereotype.Service;

@Service
public class PointService {
    private final UserRepository repo;

    public PointService(UserRepository repo) {
        this.repo = repo;
    }

    public int getBalance(Long userId) {
        // TODO: 구현 예정
        return 0;
    }

    public void charge(Long userId, Integer amount) {
        // TODO: 구현 예정
    }

    public void use(Long userId, Integer amount) {
        // TODO: 구현 예정
    }
}

package com.test.safepoint.point;

public class User {
    private Long id;
    private int points;

    public User(Long id, int points) {
        this.id = id;
        this.points = points;
    }

    public Long getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

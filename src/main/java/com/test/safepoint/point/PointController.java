package com.test.safepoint.point;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/points")
public class PointController {
    private final PointService service;

    public PointController(PointService service) {
        this.service = service;
    }

    @GetMapping("/{userId}")
    public int getBalance(@PathVariable Long userId) {
        // 구현 예정 시작
        return 0;
    }

    @PatchMapping("/{userId}/charge")
    public void charge(@PathVariable Long userId, @RequestBody int amount) {
        // 구현 예정
    }

    @PatchMapping("{userId}/use")
    public void use(@PathVariable Long userId, @RequestBody int amount) {
        // 구현 예정
    }
}

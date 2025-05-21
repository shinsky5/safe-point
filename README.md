# SafaPointUnit

포인트 충전 및 사용 서비스의 단위/통합/동시성 테스트 학습용 프로젝트입니다.

## 기능
- 포인트 충전 및 사용
- 잔약 조회
- 동시성 테스트

## 기술 스택
- Java 17
- Spring Boot 3.x
- Lombok
- JUnit5, Mockito

## 실행 방법
```bash
./gradlew bootRun
```

## 테스트 실행
```bash
./gradlew test
```

## 폴더 구조
SafePointUnit/
├── domain/        # User 도메인 엔티티
├── repository/    # 인메모리 User 저장소
├── service/       # 포인트 충전/사용 로직
├── controller/    # REST API
└── test/          # 단위/통합/동시성 테스트

## 테스트 시나리오 요약
- 포인트 충전 시 증가 확인
- 포인트 사용 시 차감 확인(잔액 부족 시 예외)
- 동시성 처리

## 학습 포인트
- 테스트는 설계를 유도한다
- 동시성은 실습을 통해 체감한다
- 테스트시 의존성 분리에 대해 고민한다



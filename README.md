
김영한님의 [실전! 스프링 데이터 JPA](https://www.inflearn.com/course/%25EC%258A%25A4%25ED%2594%2584%25EB%25A7%2581-%25EB%258D%25B0%25EC%259D%25B4%25ED%2584%25B0-JPA-%25EC%258B%25A4%25EC%25A0%2584/dashboard) 실습 코드 아카이브

---

### 💻 Development Environment

* Java 21
* Spring Boot 4.0.3
* Gradle
* Database: H2
* IDE: IntelliJ

### 🏆 실습 목표

* 스프링 데이터 JPA의 내부 동작 원리와 `JpaRepository` 공통 인터페이스 구조 이해
* 메소드 이름 기반 쿼리 생성, `@Query`를 이용한 직접 쿼리 작성 등 다양한 쿼리 처리 방법 학습
* 순수 JPA의 복잡한 페이징 로직을 스프링 데이터 JPA로 전환하고 최적화하는 노하우 습득
* Auditing, 사용자 정의 리포지토리, Web 페이징 확장 기능 등을 활용해 반복 코드를 줄이고 생산성을 극대화하는 방법 체득

### 📝 Curriculum

1. [**프로젝트 환경설정**](https://mxxikr.github.io/posts/spring-data-jpa-project-setup/)
   * 스프링 부트 기반의 라이브러리 구성 및 H2 데이터베이스 연동
   * 데이터 소스 및 JPA 설정 후 기본 동작(엔티티 저장 및 조회) 검증


2. [**예제 도메인 모델**](https://mxxikr.github.io/posts/spring-data-jpa-domain-model/)
   * 강의 실습 전반에 사용될 회원(Member)과 팀(Team) 엔티티 설계 및 양방향 연관관계 매핑 테스트


3. [**공통 인터페이스 기능**](https://mxxikr.github.io/posts/spring-data-jpa-common-interface)  
   - 순수 JPA 기반 리포지토리의 한계 분석 및 스프링 데이터 JPA 공통 인터페이스(`JpaRepository`) 적용
   * 공통 인터페이스의 상속 구조 및 프록시를 통한 동적 구현체 생성 원리 파악


4. [**쿼리 메소드 기능**]()
   * 메소드 이름으로 쿼리 생성하는 관례 및 JPA NamedQuery 호출 방법
   * `@Query` 애노테이션을 활용한 리포지토리 내 인터페이스 직접 쿼리(엔티티, 값, DTO) 작성
   * 스프링 데이터 JPA의 `Page`, `Slice` 인터페이스를 활용한 페이징과 정렬 실무 활용법
   * 벌크성 수정 쿼리 시 주의점(영속성 컨텍스트 초기화) 및 `@EntityGraph`를 활용한 페치 조인(N+1 문제 해결) 실습


5. [**확장 기능**]()
   * 인터페이스 설계의 한계를 극복하기 위한 사용자 정의 리포지토리 구현 전략
   * `@EnableJpaAuditing`을 이용한 엔티티의 생성일/수정일, 생성자/수정자 자동 관리
   * Web MVC 확장: HTTP 파라미터를 엔티티로 자동 변환하는 도메인 클래스 컨버터 및 전역 페이징/정렬 기본값 설정


6. [**스프링 데이터 JPA 분석**]()
   * 공통 인터페이스의 기본 구현체인 `SimpleJpaRepository`의 내부 구조와 `@Transactional` 동작 방식 분석
   * `save()` 메서드 호출 시 `persist`와 `merge`의 분기 로직 이해 및 `Persistable` 인터페이스를 활용한 새로운 엔티티 판별 최적화


7. [**나머지 기능들**]()
   * Specifications, Query By Example 등 부가 기능의 개념 및 실무 도입 시 복잡도 측면의 한계점 검토
   * Projections를 활용한 엔티티 대신 인터페이스나 DTO 기반의 부분 데이터 조회 기법
   * 네이티브 쿼리 적용 방법 및 제약 사항 확인
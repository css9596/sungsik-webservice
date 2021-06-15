package com.webservice.sungsik.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    //JpaRepository<Entity 클래스, PK타입>을 상속하면 기본적인 CRUD 메소드 생성.
    //ibatis나 MyBatis 등에서 Dao라고 불리는 DB Layer가 JPA에선 JpaRepository이다.
    //Entity클래스와 Entity Repository는 같이 있어야한다.
}

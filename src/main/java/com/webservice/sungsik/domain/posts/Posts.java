package com.webservice.sungsik.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //클래스 나 모든 필드의 Getter Method 생성.
@NoArgsConstructor  //기본생성자 자동생성 public Posts(){}
@Entity //테이블과 링크될 클래스임을 명시
public class Posts {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK의 생성규칙
    private Long id;

    @Column(length = 500, nullable = false) //테이블의 컬럼을 명시한다, @Entitiy 어노테이션으로 등록되어 있는 클래스의 필드는 자동으로
    //컬럼으로 등록이 되지만, 별도의 설정이 필요할 때 설정한다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //해당 클래서의 빌더 패턴 클래스 생성 - 생성자 상단에 선언 시 생성자의 포함된 필드만 빌더에 포함.
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}

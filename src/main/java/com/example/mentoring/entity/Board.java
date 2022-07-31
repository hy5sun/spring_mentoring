package com.example.mentoring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Entity 는 데이터베이스 테이블이라고 보면 됩니다.
 * Entity를 만들고 실행한 후, 데이터베이스를 확인해보면 아래 코드대로 테이블이 생성된 걸 볼 수 있습니다.
 */

@Data //Getter + Setter / 다른 파일에서 이 파일의 데이터를 받을 수 있도록 해줌
@AllArgsConstructor //모든 인스터스를 받는 생성자
@NoArgsConstructor //빈 생성자
@Entity //저는 Entity에요!!!! 스프링이 Board Entity임을 인식할 수 있다.

public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //인스턴스를 생성하면 자동으로 인덱스를 붙여라
    private Long id;

    private String title;

    private String content;

    private String writer;

}
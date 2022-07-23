package com.example.mentoring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Entity 는 데이터베이스 테이블이라고 보면 됩니다.
 * Entity를 만들고 실행한 후, 데이터베이스를 확인해보면 아래 코드대로 테이블이 생성된 걸 볼 수 있습니다.
 */

@Data //Getter + Setter
@AllArgsConstructor //모든 인스터스를 받는 생성자
@NoArgsConstructor //빈 생성자
@Entity //얘를 꼭 붙여야함! Board가 Entity임을 명시.
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //인스턴스를 생성하면 자동으로 인덱스를 붙여라
    private Long id;

    private String title;

    private String content;

    private String writer;

}
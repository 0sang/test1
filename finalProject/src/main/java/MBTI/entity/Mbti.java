package MBTI.entity;

import javax.persistence.*;

@Entity
public class Mbti {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MBTI_INDEX")
    private Long mbtiIndex;

    @Column(name = "MBTI_NAME")
    private String mbtiName;

    @Column(name = "MBTI_DESC")
    private String mbtiDesc;
}

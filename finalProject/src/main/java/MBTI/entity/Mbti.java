package MBTI.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "MBTI")
@Data
public class Mbti {

    @Id
    @Column(name = "MBTI_NAME")
    private String name;

    @Column(name = "MBTI_DESC")
    private String desc;
}

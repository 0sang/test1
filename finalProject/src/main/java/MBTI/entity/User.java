package MBTI.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "USER_INFO")
public class User {

    @Id
    @Column(name = "USER_ID")
    private String id;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "PASSWORD")
    private String password;

    @JoinColumn(name = "MBTI_NAME")
    @OneToOne(fetch = FetchType.LAZY)
    private Mbti mbti;

    @Column(name = "EMAIL")
    private String email;
}

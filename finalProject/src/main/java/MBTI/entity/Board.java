package MBTI.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.*;

@Entity
@Table(name = "BOARD")
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POST_INDEX")
    private int postIndex;

    @Column(name = "POST_TITLE")
    private String postTitle;

    @Column(name = "POST_CONTENTS")
    private String postContents;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;
}

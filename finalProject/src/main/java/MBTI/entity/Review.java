package MBTI.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Review {

    @Id
    @Column(name = "R_INDEX")
    private int rIndex;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISBN", nullable = false)
    private Book isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User writer;

    @Column(name = "REVIEW")
    private String review;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "")
    private Like like;
}

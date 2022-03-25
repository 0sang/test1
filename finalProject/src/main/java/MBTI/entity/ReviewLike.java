package MBTI.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="REVIEW_LIKE")
@Data
public class ReviewLike {

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REVIEW_INDEX")
    private Review review;

    @Column(name = "COUNT")
    private int count;
    
}

package MBTI.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "VERSE_LIKE")
@Data
public class VerseLike {

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VERSE_INDEX")
    private Verse verse;

    @Column(name = "COUNT")
    private int count;
    
}

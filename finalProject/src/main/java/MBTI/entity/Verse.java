package MBTI.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "VERSE")
public class Verse {

    @Id
    @Column(name = "INDEX")
    private int index;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISBN", nullable = false)
    private Book isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User writer;

    @Column(name = "VERSE")
    private String verse;

    @Column(name = "PAGE")
    private int page;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "")
    private Like like;
}

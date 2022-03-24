package MBTI.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "LIBRARY")
@Data
public class Lib {

    @Id
    @Column(name = "LIB_INDEX")
    private int libIndex;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISBN", nullable = false)
    private Book isbn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User userId;
}

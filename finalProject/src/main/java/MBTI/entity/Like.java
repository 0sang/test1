package MBTI.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Like {

    @Id
    @Column(name = "")
    private int likeIndex;

    @Column(name = "")
    private int book;

    @Column(name = "")
    private int verse;

    @Column(name = "")
    private int review;
    
}

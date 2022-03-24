package MBTI.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "BOOK_INFO")
@Data
public class Book {

    @Id
    @Column(name = "ISBN", nullable = false)
    private String isbn;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "LINK")
    private String link;

    @Column(name = "IMAGE_URL")
    private String imageUrl;

    @Column(name = "AUTHOR", nullable = false)
    private String author;

    @Column(name = "PRICE", nullable = false)
    private int price;

    @Column(name = "DISC_PRICE")
    private int disPrice;

    @Column(name = "PUBLISHER", nullable = false)
    private String publisher;

    @Column(name = "PUB_DATE", nullable = false)
    private String pubDate;

    @Column(name = "BOOK_DESC")
    private String bookDesc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MBTI_INDEX", nullable = false)
    private Mbti mbti;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "S_POINT", nullable = false)
    private Like sPoint;
}

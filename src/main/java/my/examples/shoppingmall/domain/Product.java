package my.examples.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="product")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=50)
    private String name;
    private int price;
    private int amount;
    @Column(name="reg_date")
    private Date regDate;
    private Double rating;

    @ManyToOne
    @JoinColumn(name="category_id")
    private ProductCategory productCategory;

    @OneToMany(mappedBy="product")
    private List<Image> imageList;

    @OneToMany(mappedBy="product")
    private List<Review> reviewList;

    @OneToMany(mappedBy = "product")
    private List<Wish> wishes;

    public Product() {
        regDate = new Date();
        reviewList = new ArrayList<>();
        imageList = new ArrayList<>();
        wishes = new ArrayList<>();
        price = 0;
        amount = 0;
        rating = 0.0;
    }
}

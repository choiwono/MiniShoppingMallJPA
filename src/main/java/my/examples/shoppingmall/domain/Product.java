package my.examples.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private ProductCategory productCategory;

    @OneToMany
    @JoinColumn(name="product_id")
    private Set<FileImage> fileImages;

    @OneToMany
    @JoinColumn(name="product_id")
    private List<Review> reviewList;

    @OneToMany
    @JoinColumn(name="product_id")
    private List<Wish> wishes;

    @OneToMany
    @JoinColumn(name="product_id")
    private List<OrderProduct> orderProducts;

    @OneToMany
    @JoinColumn(name="product_id")
    private List<PurchaseRecord> purchaseRecords;

    public Product() {
        regDate = new Date();
        reviewList = new ArrayList<>();
        fileImages = new HashSet<>();
        wishes = new ArrayList<>();
        orderProducts = new ArrayList<>();
        purchaseRecords = new ArrayList<>();
        price = 0;
        amount = 0;
        rating = 0.0;
    }
}

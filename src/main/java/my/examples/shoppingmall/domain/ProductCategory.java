package my.examples.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="product_category")
@Getter
@Setter
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=50,name="category_name")
    private String categoryName;
    @Column(name="reg_date")
    private Date regDate;

    @OneToMany(mappedBy = "productCategory")
    private List<Product> productList;

    public ProductCategory() {
        regDate = new Date();
    }
}

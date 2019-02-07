package my.examples.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private char status;
    private int totalPrice;
    @Column(name="order_No")
    private String orderNo;
    @Column(name="reg_date")
    private Date regDate;

    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProductList;

    public Order() {
        regDate = new Date();
        status = 0;
        totalPrice = 0;
    }
}

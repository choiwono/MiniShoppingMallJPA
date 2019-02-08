package my.examples.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany
    @JoinColumn(name="order_id")
    private List<OrderProduct> orderProductList;

    public Order() {
        regDate = new Date();
        orderProductList = new ArrayList<>();
        status = 0;
        totalPrice = 0;
    }
}

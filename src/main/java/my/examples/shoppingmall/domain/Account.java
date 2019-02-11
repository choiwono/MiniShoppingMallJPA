package my.examples.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="account")
@Getter
@Setter
@ToString
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=20)
    private String name;
    private String nickName;
    private String email;
    private String passwd;
//    private String address;
//    @Column(length=50)
//    private String phone;
    @Column(name="reg_date")
    private Date regDate;

    @ManyToMany
    @JoinTable(name="account_roles",
            joinColumns = {@JoinColumn(name = "account_id",referencedColumnName = "id")},
            inverseJoinColumns ={@JoinColumn(name = "role_id",referencedColumnName = "id")}
    )
    private Set<Role> roles;

    @OneToMany
    @JoinColumn(name="account_id")
    private List<Review> reviewList;

    @OneToMany
    @JoinColumn(name="account_id")
    private List<AccountAddress> accountAddresses;
//    @OneToMany(mappedBy = "account")
//    private List<OrderProduct> orderProducts;

    @OneToMany
    @JoinColumn(name="account_id")
    private List<Wish> wishList;

    @OneToMany
    @JoinColumn(name="account_id")
    private List<PurchaseRecord> purchaseRecords;

    public Account() {
        regDate = new Date();
        reviewList = new ArrayList<>();
        wishList = new ArrayList<>();
        roles = new HashSet<>();
        purchaseRecords = new ArrayList<>();
        accountAddresses = new ArrayList<>();
    }
}

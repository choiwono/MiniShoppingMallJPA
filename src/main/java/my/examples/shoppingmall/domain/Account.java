package my.examples.shoppingmall.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="account")
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=20)
    private String name;
    @Column(length=255)
    private String email;
    @Column(length=255)
    private String passwd;
    @Column(length=255)
    private String address;
    @Column(length=50)
    private String phone;
    @Column(name="reg_date")
    private Date regDate;

    @ManyToMany
    @JoinTable(name="account_roles",
            joinColumns = {@JoinColumn(name = "account_id",referencedColumnName = "id")},
            inverseJoinColumns ={@JoinColumn(name = "role_id",referencedColumnName = "id")}
    )
    private Set<Role> roles;

    @OneToMany(mappedBy="account")
    private List<Review> reviewList;

    @OneToMany(mappedBy="account")
    private List<OrderProduct> orderProducts;


    @OneToMany(mappedBy="account")
    private List<Wish> wishList;

    public Account() {
        regDate = new Date();
        reviewList = new ArrayList<>();
        wishList = new ArrayList<>();
        roles = new HashSet<>();
    }
}

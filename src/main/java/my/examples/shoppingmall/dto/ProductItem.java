package my.examples.shoppingmall.dto;

import lombok.Data;
import java.util.Date;

@Data
public class ProductItem {
    private Long id;
    private String name;
    private int amount;
    private int price;
    private Double rating;
    private Date regDate;
}

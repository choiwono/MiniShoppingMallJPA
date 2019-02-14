package my.examples.shoppingmall.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class CartItem {
    private Long productId;
    private int quantity;
}

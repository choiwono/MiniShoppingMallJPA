package my.examples.shoppingmall.dto;

import lombok.Data;

@Data
public class CartItem {
    private Long productId;
    private int quantity;
}

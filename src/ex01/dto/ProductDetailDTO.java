package ex01.dto;

import lombok.Data;
import ex01.model.ProductOption;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProductDetailDTO {

    private int productId;
    private String productName;

    // 필드 이름도 간단하게
    private List<ProductOptionDTO> options = new ArrayList<>();

    // 매개변수 이름은 간단하게.
    public ProductDetailDTO(List<ProductOption> options) {
        this.productId = options.get(0).getProduct().getId();
        this.productName = options.get(0).getProduct().getName();

        // models -> DTOs 로 복제
        for (ProductOption option : options) {
            this.options.add(new ProductOptionDTO(option));
        }
    }

    @Data
    class ProductOptionDTO {
        private int id;
        private String name;
        private int price;
        private int qty;

        public ProductOptionDTO(ProductOption option) {
            this.id = option.getId();
            this.name = option.getName();
            this.price = option.getPrice();
            this.qty = option.getQty();
        }
    }
}

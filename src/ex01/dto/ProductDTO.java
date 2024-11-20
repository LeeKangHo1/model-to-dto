package ex01.dto;

import lombok.Data;
import ex01.model.Product;

@Data
public class ProductDTO {
    private int id;
    private String name;

    // DTO는 화면 1개당 1개씩 종속 시키면 된다.
    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
    }
}
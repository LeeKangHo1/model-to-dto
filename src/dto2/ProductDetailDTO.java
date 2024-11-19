package dto2;

import model.ProductOption;

import java.util.List;

public class ProductDetailDTO {
    private int productId;
    private List<ProductOption> productOptions;

    public ProductDetailDTO(int productId, List<ProductOption> productOptions) {
        this.productId = productId;
        this.productOptions = productOptions;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public List<ProductOption> getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(List<ProductOption> productOptions) {
        this.productOptions = productOptions;
    }

    @Override
    public String toString() {
        return "ProductDetailDTO{" +
                "productId=" + productId +
                ", productOptions=" + productOptions +
                '}';
    }
}

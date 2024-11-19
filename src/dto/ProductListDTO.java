package dto;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListDTO {
    private List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();

    public ProductListDTO(List<Product> products) {
        List<ProductDTO> pDTOList = new ArrayList<ProductDTO>();
        for (Product product : products) {
            ProductDTO productDTO = new ProductDTO(product.getId(), product.getName());
            pDTOList.add(productDTO);
        }
        this.productDTOList = pDTOList;
    }

    public List<ProductDTO> getProductDTOList() {
        return productDTOList;
    }

    @Override
    public String toString() {
        return "{" +
                "products=" + productDTOList +
                '}';
    }

    public void setProductDTOList(List<ProductDTO> productDTOList) {
        this.productDTOList = productDTOList;
    }

    public class ProductDTO {
        private int id;
        private String name;

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ProductDTO(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}

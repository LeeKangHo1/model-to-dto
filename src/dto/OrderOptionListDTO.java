package dto;

import java.util.List;

public class OrderOptionListDTO {
    int productId;
    private List<OrderOptionDTO> orderOptionDTOList;

    public OrderOptionListDTO(int productId, List<OrderOptionDTO> orderOptionDTOList) {
        this.productId = productId;
        this.orderOptionDTOList = orderOptionDTOList;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public List<OrderOptionDTO> getOrderOptionDTOList() {
        return orderOptionDTOList;
    }

    public void setOrderOptionDTOList(List<OrderOptionDTO> orderOptionDTOList) {
        this.orderOptionDTOList = orderOptionDTOList;
    }

    @Override
    public String toString() {
        return "OrderOptionListDTO{" +
                "productId=" + productId +
                ", orderOptionDTOList=" + orderOptionDTOList +
                '}';
    }
}
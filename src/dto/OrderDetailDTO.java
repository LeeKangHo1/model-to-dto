package dto;

import model.OrderOption;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailDTO {
    private int orderId;
    private List<OrderOptionListDTO> orderOptionListDTO;
    private int totalPrice;

    public OrderDetailDTO(List<OrderOption> orOptions) {
        this.orderId = orOptions.get(0).getOrder().getId();

        int allPrice = 0;
        for (OrderOption o : orOptions) {
            allPrice += o.getTotalPrice();
        }
        this.totalPrice = allPrice;

        List<OrderOptionListDTO> orderOptionListDTOs = new ArrayList<OrderOptionListDTO>();

        OrderOptionListDTO orderOptionListDTOs1 = new OrderOptionListDTO(1, new ArrayList<OrderOptionDTO>());
        OrderOptionListDTO orderOptionListDTOs2 = new OrderOptionListDTO(2, new ArrayList<OrderOptionDTO>());

        for (OrderOption o : orOptions) {
            OrderOptionDTO orderOptionDTO = new OrderOptionDTO(
                    o.getId(), o.getOptionName(), o.getQty(), o.getTotalPrice()
            );
            int index = o.getProduct().getId() - 1;
            // TODO: o.getProduct().getId() 별로 컬렉션을 따로 만들어야 한다.

            if (o.getProduct().getId() == 1) {
                orderOptionListDTOs1.getOrderOptionDTOList().add(orderOptionDTO);
            } else if (o.getProduct().getId() == 2) {
                orderOptionListDTOs2.getOrderOptionDTOList().add(orderOptionDTO);
            }
        }

        orderOptionListDTOs.add(orderOptionListDTOs1);
        orderOptionListDTOs.add(orderOptionListDTOs2);

        this.orderOptionListDTO = orderOptionListDTOs;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderOptionListDTO> getOrderOptionListDTOList() {
        return orderOptionListDTO;
    }

    public void setOrderOptionListDTOList(List<OrderOptionListDTO> orderOptionListDTOList) {
        this.orderOptionListDTO = orderOptionListDTOList;
    }

    @Override
    public String toString() {
        return "OrderDetailDTO{" +
                "orderId=" + orderId +
                ", totalPrice=" + totalPrice +
                ", orderOptionListDTOList=" + orderOptionListDTO +
                '}';
    }
}

package dto2;

public class OrderOptionDTO {
    private int id;
    private String optionName;
    private int qty;
    private int totalPrice;

    public OrderOptionDTO(int id, String optionName, int qty, int totalPrice) {
        this.id = id;
        this.optionName = optionName;
        this.qty = qty;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "OrderOptionDTO{" +
                "id=" + id +
                ", optionName='" + optionName + '\'' +
                ", qty=" + qty +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

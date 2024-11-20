package ex01.dto;

import lombok.Data;
import ex01.model.OrderOption;

import java.util.*;

@Data
public class OrderDetailDTO {
    // DTO 만들면서 import가 생기면 안된다.
    private int orderId;
    private List<OrderProductDTO> products = new ArrayList<>();
    private int sumPrice;

    // 이너클래스보다 여기서부터 적어야 한다.
    public OrderDetailDTO(List<OrderOption> options) {
        // 1. orderId
        this.orderId = options.get(0).getOrder().getId();

        // 2. sumPrice -> 여기선 1개만 해. for 2번 돌려
        for (OrderOption option : options) {
            this.sumPrice += option.getTotalPrice();
        }

        // 3. products
        // 3.1 주문옵션들 productId [1, 1, 2] -> [1, 2] OrderProductDTO 2개 만들기

//        List<OrderOption> p1 = Arrays.asList(options.get(0), options.get(1));
//        List<OrderOption> p2 = Arrays.asList(options.get(2));
//        OrderProductDTO product = new OrderProductDTO(p1);
//        OrderProductDTO product2 = new OrderProductDTO(p2);

        Set<Integer> ids = new HashSet<>(); // [1, 2]를 넣어야 한다.
        for (OrderOption option : options) {
            ids.add(option.getProduct().getId());
        }

        // 3.2 중복된 상품의 크기만큼 반복하면서 주문 옵션 추가하기
        for (Integer id : ids) {
            // 임시 봉투
            List<OrderOption> temp = new ArrayList<>();

            for (OrderOption option : options) {
                if (id == option.getProduct().getId()) {
                    temp.add(option);
                }
            }

            OrderProductDTO product = new OrderProductDTO(temp);

            // this.products로 안 적어도 된다. products 와 같은 이름의 변수가 없어서
            products.add(product);
        }
    }

    @Data
    class OrderProductDTO { // 돈봉투
        private int productId;
        private List<OrderOptionDTO> options = new ArrayList<>();

        // 생성자에는 DTO를 적을 일이 없다.
        public OrderProductDTO(List<OrderOption> options) {
            this.productId = options.get(0).getProduct().getId();

            for (OrderOption option : options) {
                this.options.add(new OrderOptionDTO(option));
            }
        }

        @Data
        class OrderOptionDTO {
            private int id;
            private String optionName;
            private int qty;
            private int totalPrice;

            public OrderOptionDTO(OrderOption option) {
                this.id = option.getId();
                this.optionName = option.getOptionName();
                this.qty = option.getQty();
                this.totalPrice = option.getTotalPrice();
            }
        }
    }
}

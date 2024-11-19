public class App2 {
//    public static void main(String[] args) {
//        // 1. 상품 2개
//        Product p1 = new Product(1, "바지");
//        Product p2 = new Product(2, "티");
//
//        // 2. 옵션 4개 생성 (2-1, 2-2)
//        ProductOption op1 = new ProductOption(1, "파란바지", 1000, 10, p1);
//        ProductOption op2 = new ProductOption(2, "빨간바지", 2000, 10, p1);
//        ProductOption op3 = new ProductOption(3, "노랑티", 1000, 10, p2);
//        ProductOption op4 = new ProductOption(4, "하얀티", 2000, 10, p2);
//
//        // 3. 구매
//        Order or1 = new Order(1);
//        OrderOption orOption1 = new OrderOption(1, "파란바지", 2, 2000, p1, or1);
//        OrderOption orOption2 = new OrderOption(2, "빨간바지", 2, 4000, p1, or1);
//        OrderOption orOption3 = new OrderOption(3, "하얀티", 5, 10000, p2, or1);
//        List<OrderOption> or1Options = Arrays.asList(orOption1, orOption2, orOption3);
//        op1.setQty(op1.getQty() - 2);
//        op2.setQty(op2.getQty() - 2);
//        op4.setQty(op4.getQty() - 5);
//
//        Order or2 = new Order(2);
//        OrderOption orOption4 = new OrderOption(4, "노랑티", 7, 7000, p2, or2);
//        List<OrderOption> or2Options = Arrays.asList(orOption4);
//        op3.setQty(op3.getQty() - 7);
//
//        // 4. 상품 목록 화면
//        // p1와 p2를 컬렉션에 담아서 출력
//        List<Product> products = Arrays.asList(p1, p2); // 1번 문제 -> products DTO로 옮기기
//        ProductListDTO productListDTO = new ProductListDTO(products);
//        System.out.println(productListDTO);
//        System.out.println("=========================");
//
//        // 5. 상품 상세 화면 (p1, p2)
//        // p1 화면
//        List<ProductOption> p1Options = Arrays.asList(op1, op2); // 2번 문제 -> p1, p1Options DTO로 옮기기
//        ProductDetailDTO product1DetailDTO = new ProductDetailDTO(p1.getId(), p1Options);
//        // p2 화면
//        List<ProductOption> p2Options = Arrays.asList(op3, op4);
//        ProductDetailDTO product2DetailDTO = new ProductDetailDTO(p2.getId(), p2Options);
//
//        System.out.println("상품 상세 화면 p1");
//        System.out.println(product1DetailDTO);
//        System.out.println("상품 상세 화면 p2");
//        System.out.println(product2DetailDTO);
//        System.out.println("=========================");
//
//        // 6-1. 주문 상세 확인 화면 (or1)
//        OrderDetailDTO order1DetailDTO = new OrderDetailDTO(or1Options);
//        System.out.println("주문 상세 확인 화면 or1");
//        System.out.println(order1DetailDTO);
//
//        // TODO: 바지 카테고리, 티 카테고리 섹션을 나눠서 출력해야 한다. 컬렉션 1개에 몰아서 넣지 못함
//
//        // 6-2. 주문 상세 확인 화면 (or2)
//        OrderDetailDTO order2DetailDTO = new OrderDetailDTO(or2Options);
//        System.out.println("주문 상세 확인 화면 or2");
//        System.out.println(order2DetailDTO);
//    }
}
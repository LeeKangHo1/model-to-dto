package ex02;

// 1. 람다는 인터페이스로 만든다.
// 2. 인터페이스에는 메서드가 하나만 존재해야 한다.
// 3. 메서드가 인터페이스를 매개변수로 받고 있으면, 행위를 주세요!!
// 4. 람다에서는 배개변수에 타입을 생략 가능하다.
// 5. @FunctionalInterface 표시가능


public class App {
    public static void main(String[] args) {

        // 람다식
        MyConsumer<Integer> r1 = (data) -> {
            System.out.println("소비할 데이터 : " + data);
        };
        r1.accept(1);

        // 람다표현식 (return 가능)
        MySupplier<String> r2 = () -> { return "good"; };
        MySupplier<String> r3 = () -> "good"; // return 생략 가능
        String msg = r3.get();
        System.out.println(msg);

        MyFunction<String, Integer> r4 = (s) -> s.length();
        Integer size = r4.apply("Lambda");
        System.out.println(size);

        MyPredicate<String> r5 = (s) -> s.length() < 10;
        Boolean b = r5.apply("Lambda");
        System.out.println(b);
    }
}

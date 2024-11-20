package ex03;

import java.util.Optional;

// orElseThrow구조
class Good {
    int run(int n) {
        if (n != 0) {
            return n;
        } else {
            throw new RuntimeException();
        }
    }
}

// 옵셔널 : null 처리를 위해 사용
public class App {
    public static void main(String[] args) {
        String data1 = null;
        // 아래 처럼 처리하면 불편
//        String d1 = data1;
//        if (d1 != null) {
//            System.out.println(d1.length());
//        }

        Optional<String> op1 = Optional.ofNullable(data1);
        // 아래 과정이 일어난다?
        if (op1.isPresent()) {
            String r1 = op1.get();
            System.out.println("r1 : " + r1);
        }

        // 실제 활용 (+람다)
        String data2 = null;
        // data2가 null이면 "없어"를 반환
        String r2 = Optional.ofNullable(data2).orElseGet(() -> "없어");
        System.out.println("r2 : " + r2);

        // 예외처리에 아주 많이 사용할 예정
        String data3 = null; // 값이 있으면 그 값을 리턴
        String r3 = Optional.ofNullable(data3)
                .orElseThrow(() -> new RuntimeException("값이 없는데?? 조심해 너!"));
        System.out.println("r3 : " + r3);
    }
}

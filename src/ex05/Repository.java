package ex05;

import java.util.Arrays;
import java.util.List;

public class Repository {
    public List<Integer> findAll() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }

    public int findById() {
        // 조회하다가 오류가 나면 [숫자를 리턴]
        // -1 오류 (안됨 - 타입이 달라질 수 있다. 오류 메세지 날리겠다고 String 포함시키면 복잡)
        // 오류가 난 곳에서 처리 (안됨) - 책임이 분리되어 있으니까(SRP)

        throw new RuntimeException("디비에서 오류가 났어");
    }
}

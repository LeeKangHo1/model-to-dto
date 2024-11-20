package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
*
* */
public class ReduceApp2 {
    public static void main(String[] args) {
        // 20만원 빌렸는데 하루마다 버는 돈이 다르다. 총 번 금액 20만원 넘었으면 갚아라
        int origin = 31500;
        List<Integer> list = Arrays.asList(27000, 32000, 4000, 10000, 40000, 20000, 28000);

        int sum = list.stream()
                .map(integer -> integer - 2000) // 교통비 2000원 빼줘
                .reduce(origin, (x, y) -> x + y);
        System.out.println("니가 들고 있는 돈 : " + sum);
        
    }
}

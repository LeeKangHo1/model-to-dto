package ex04;

import java.util.Arrays;
import java.util.List;

public class SortApp {
    public static void main(String[] args) {
        // 4. sort, distinct
        List<Integer> nums = Arrays.asList(5, 3, 1, 4, 2, 5);

        nums.stream()
                .sorted()
                .distinct() // 중복 제거, 순서는 관계 없지만 상식적으로 정률 후 중복제거
                .forEach(integer -> System.out.println(integer));
    }
}

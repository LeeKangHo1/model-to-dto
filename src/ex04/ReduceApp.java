package ex04;

import java.util.Arrays;
import java.util.List;

public class ReduceApp {
    public static void main(String[] args) {
        // 3. reduce (조인)
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        int sum = nums.stream() // Stream<Integer>를 반환
                .mapToInt(x -> x) // 컬렉션으로 반환?
                .sum();

        System.out.println(sum);

        int sum2 = nums.stream()
                // map과 다른 점 -> 5라는 인수 사용 가능
                .reduce(5, (prev, next) -> {
                    System.out.println("prev : " + prev);
                    System.out.println("next : " + next);
                    System.out.println("----------------");
                    return prev + next;
                });
        System.out.println(sum2);
    }
}

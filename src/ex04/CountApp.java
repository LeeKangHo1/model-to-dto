package ex04;

import java.util.Arrays;
import java.util.List;

public class CountApp {
    public static void main(String[] args) {
        // 1. count
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 람다 Predicate
        List<String> r1 = names.stream()
                .filter(name -> name.length() > 3)
                .toList();

        // 람다 Consumer
        r1.forEach(s -> System.out.println(s));

        long r2 = names.stream()
                .filter(name -> name.length() > 3)
                .count();
        System.out.println(r2);
    }
}

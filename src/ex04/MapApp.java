package ex04;

import java.util.Arrays;
import java.util.List;

public class MapApp {
    public static void main(String[] args) {
        // 2. map (기존 데이터 변형할 때 쓴다.)
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 대문자 소문자 바꾸려면 임시 컬렉션 만들어서 집어 넣고 꺼내야 한다. -> 코드가 길어진다.
        List<String> newNames = names.stream()
                // 중간연산은 적는 만큼 무한으로 가능
                .map(name -> name.toLowerCase())
                .filter(name -> name.length() > 3)
                .toList();

        newNames.forEach(name -> System.out.println(name));

    }
}

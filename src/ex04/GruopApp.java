package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GruopApp {
    public static void main(String[] args) {
        // 5. group
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        // <그룹이름, 컬렉션> 그룹이름에 컬렉션이 들어간다.
//        Map<String, Object>

//        Map<Character, List<String>> groupData = names.stream()
        var groupData = names.stream() // 자바 17부터 추가.
                // 대소문자 구분 안하게. LowerCase가능
                .map(name -> name.toUpperCase())
                // 제일 첫 글자에 따라 분류해서 컬렉션을 넣는다.
                // key A에 컬랙션(A로 시작하는 문자열)추가
                // key B에 컬렉션(B로 시작하는 문자열)추가
                // A 중복 시 원래 있던 곳으로 넣는다.
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(groupData);

        System.out.println(groupData.get('A'));
    }
}

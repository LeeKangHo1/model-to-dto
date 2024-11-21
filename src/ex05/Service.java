package ex05;

import java.util.List;

public class Service {

    // 여기서 생성자 까지를 컴포지션(has-a) 관계
    private final Repository repo;

    public Service(Repository repo) {
        this.repo = repo;
    }

    public List<Integer> 목록보기() {
        return repo.findAll();
    }

    public int 상세보기() {
        // 예외를 던지는 메서드인데 빨간줄 없다 -> 컴파일예외가 아니라 런타임예외라
        return repo.findById();
    }
}

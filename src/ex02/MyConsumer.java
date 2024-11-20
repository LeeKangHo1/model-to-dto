package ex02;

// 입력(매개 변수)만 받고 출력이 없는 연산을 수행합니다.
public interface MyConsumer<T> {
    void accept(T data);
}

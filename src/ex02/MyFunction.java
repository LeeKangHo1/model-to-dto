package ex02;

// 입력을 받아서 결과를 반환 (매개변수도 있고 반환값도 있다)
public interface MyFunction<T, R> {
    R apply(T t);
}

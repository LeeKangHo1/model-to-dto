package ex02;

// 입력 없이 값을 반환(return)
@FunctionalInterface // 인터페이스에 메서드가 1개 인지 체크, 제대로 된 정의는 체크
public interface MySupplier<T> {
        T get();
//        void good();
}

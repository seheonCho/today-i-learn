package learnJava.불변;

// 1. 클래스를 `final` 로 선언한다.
public final class ImmutableInt {

    // 2. 모든 클래스 변수를 private와 final로 선언한다.
    private final int number;

    // 3. 객체를 생성하기 위한 생성자 또는 정적 팩토리 메소드를 추가하라, ( setter 메소드 제거 )
    public ImmutableInt(int number) {
        this.number = number;
    }

}

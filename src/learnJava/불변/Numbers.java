package learnJava.불변;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. 클래스를 `final` 로 선언한다.
public final class Numbers {

    // 2. 모든 클래스 변수를 private와 final로 선언한다.
    private final List<Number> numbers;

    // 3. 객체를 생성하기 위한 생성자 또는 정적 팩토리 메소드를 추가하라.
    public Numbers(List<Number> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    // 4. 참조에 의해 변경 가능성이 있는 경우, 방어적 복사를 이용하여 전달하라
    public List<Number> getNumbers() {
        return Collections.unmodifiableList(numbers);

        // 지정된 목록의 수정할 수 없는 보기를 반환합니다.
        // 이 방법을 사용하면 모듈이 사용자에게 내부 목록에 대한 "읽기 전용" 액세스 권한을 제공할 수 있습니다.
        // 반환된 목록에 대한 쿼리 작업을 지정된 목록으로 "읽고" 직접 또는 반복자를 통해 반환된 목록을 수정하려고 하면
        // UnsupportedOperationException이 발생합니다.
        // 지정된 목록이 직렬화 가능한 경우 반환된 목록은 직렬화 가능합니다.
        // 마찬가지로 반환된 목록은 지정된 목록이 있는 경우 RandomAccess를 구현합니다.
    }


}

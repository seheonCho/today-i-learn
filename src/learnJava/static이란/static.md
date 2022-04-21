
# static

> 메모리에 할당되어, 프로그램이 종료될 때 해제되는 것을 의미

## 공통
- 변수와, 메서드의 시그니처에 포함 할 수 있다.
- `static` 키워드를 통해 생성된 정적 멤버는 `Heap` 영역이 아닌, `Static` 영역에 할당되며, 어디서든 참조가 가능하다.
- `GC (Garbage Collector)` 관리 영역이 아님.
- `java application` 실행간, `ClassLoader` 의 `load` 가 완료되면 메모리에 할당되어 사용이 가능함
  - ex) `public static void main(String[] args) {}`

## 변수
- 객체를 생성하지 않고, 해당 `static` 변수에 접근 가능

## 메서드
- 메서드 내부에서, `static` 키워드가 있는 변수에만 접근이 가능하다.

## 클래스 초기화 블록 (Initialization block)
- 클래스 변수의 복잡한 초기화에 주로 사용되며, 클래스가 로드될 때 한번만 수행된다, 생성자가 실행되지 않아도, 클래스에 대한 참조가 발생하면 호출된다.
  - 여러개 만들수 있으며, 선언 순서에 따라 실행된다.
```
public class InitClass {

    static final int TEST_NUMBER;

    static {
        System.out.println("start static...");
    }

    static {
        TEST_NUMBER = 100;
        System.out.println(TEST_NUMBER);
    }

    static {
        System.out.println("end static...");
    }

}

public class LearnStatic {

    public static void main(String[] args) {
        System.out.println(InitClass.TEST_NUMBER);
    }

}

// 출력
start static...
100
end static...
100
```

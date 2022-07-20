
# static

> 메모리에 할당되어, 프로그램이 종료될 때 해제되는 것을 의미

## 공통
- 변수와, 메서드의 시그니처에 포함 할 수 있다.
- `static` 키워드를 통해 생성된 정적 멤버는 `Heap` 영역이 아닌, `Static` 영역에 할당되며, 어디서든 참조가 가능하다.
- `GC (Garbage Collector)` 관리 영역이 아님.
- `java application` 실행간, `ClassLoader` 의 `load` 가 완료되면 메모리에 할당되어 사용이 가능함
  - ex) `public static void main(String[] args) {}`

## 정적 변수(필드)
- 객체를 생성하지 않고, 해당 `static` 변수에 접근 가능
- 해당 변수의 본사본이 하나만 생성되어, 모든 인스턴스에서 공유
  - 정적 변수(필드)를 사용해야 하는 이유
    - 변수의 값이 객체와 무관할 때
    - 값이 모든 개체에서 공유되어야 하는 경우

### 정적 변수 핵심내용
객체 참조를 사용하여, 직접 액세스 할 수 있지만, 인스턴수 변수인지, 클래스 변수인지 파악하기 어려우므로 클래스이름.변수 형태로 접근해야 한다.
ex ) Cat.NumberOfTail

## 정적 메서드
- 메서드 내부에서, `static` 키워드가 있는 변수에만 접근이 가능하다.

### 정적 메서드 핵심 내용
- 자바의 정적 메서드는 컴파일 시간에 결정
- 오버라이드 할 수 없음
- 추상 메서드는 정작일 수 없음 ex) interface's abstract method , abstract class's method

## 클래스 초기화 블록 (Initialization block, a.k.a static block)
- 클래스 변수의 복잡한 초기화에 주로 사용되며, 클래스가 로드될 때 한번만 수행된다, 생성자가 실행되지 않아도, 클래스에 대한 참조가 발생하면 호출된다.
  - 여러개 만들수 있으며, 선언 순서에 따라 실행된다.

## 정적 클래스
- 객체지향 중 중요한 특성인 캡슐화 정도를 증가시킴
- 싱글톤!

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
    
    static int sumNumber(int a, int b) {
        return a + b;
    }

}

public class LearnStatic {

    public static void main(String[] args) {
        System.out.println(InitClass.TEST_NUMBER);
        System.out.println(InitClass.sumNumber(1, 2));
    }

}

// 출력
start static...
100
end static...
100
3
```

출처

자바의 신(서적)

https://www.baeldung.com/java-static
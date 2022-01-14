# Java8
 
## java.util.function package

- Predicate
    - test()라는 메소드가 있으며, 두 개의 객체를 비교할 때 사용 하고 boolean을 리턴 한다. and(), negate(), or()등 default 메소드가 구현되어 있으며, isEqual()이라는 static 메소드도 존재.

    - 다음과 같은 방법으로선언한다.
    ```
    Predicate<String> predicateLength5 = (a) -> a.length() > 5;
    Predicate<String> predicateContains = (a) -> a.length() > 5;
    Predicate<String> predicateStart = (a) -> a.length() > 5;
    ```

- Supplier
    - get() 메소드가 있으며, 리턴값은 generic으로 선언된 타입을 리턴 한다. 다른 인터페이스들과는 다르게 추가적인 메소드는 선언되어 있지 않다.

- Consumer ★
    - accept()라는 매개 변수를 하나 갖는 메소드가 있으며, 리턴 값이 없다. 그래서, 출력을 할 때 처럼 작업을 수행하고 결과를 받을 일이 없을 때 사용한다.
    추가로 andThen() default메소드는 순차적인 작업을 할 때 유용하게 사용 된다.

- Function
    - apply()라는 하나의 매개 변수를 갖는 메소드가 있으며, 리턴값이 존재한다. 이 인터페이스는 Function<T, R>로 정의되어 있어, Generic 타입을 두개 갖고 있다.
    즉, 변환을 할 필요가 있을 때 이 인터페이스를 이용한다.

- UnaryOperator
    - apply()라는 하나의 매개 변수를 갖는 메소드가 있으며, 리턴값이 존재한다. 단, 한가지 타입에 대하여 결과도 같은 타입일 경우에 사용한다.

- BinaryOperator
    - apply()라는 두개의 매개 변수를 갖는 메소드가 있으며, 리턴값도 존재한다. 단, 한가지 타입에 대하여 결과도 같은 타입일 경우 사용한다.


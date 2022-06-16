# Lambda (람다)

익명 함수를 지칭하는 용어

Java 8 에 추가되었다.

### 장점

- 코드의 간결성
    - 람다를 사용하면 불필요한 반복문이 줄어들고, 간단히 처리가 가능
- 지연 연산 수행
    - 불필요한 연산의 최소화
- 병렬 처리 가능
    - 멀티쓰레드를 활용하여 병렬처리 사용

### 단점
- 호출이 까다롭다.
- 람다 stream 사용시 단순 `for` 문 혹은 `while` 문에 비해 성능이 떨어진다.
    - 현대의 프로그래밍 패러다임은 약간의 성능을 포기하고 협업, 유지보수에 더 많은 신경을 쓰기 때문에 단점이라고만 볼수는 없다.

### 람다의 표현식
람다는 매개변수와 화살표로 함수몸체를 이용하며 단일 실행문이면 괄호 생략 가능
`return` 문으로만 되어 있는 경우 괄호 생략 불가.

## 람다식의 문법
1. 매개 변수의 타입을 생략 가능함
2. 매개변수가 하나 이거나, 없을때 감싸는 대괄호 생략 가능
3. 구현부가 한 줄안에 끝나는 경우 중괄호와 `return` 생략 가능

### 람다를 이용한 쓰레드 사용방식

### Before
```
new Thread(new Runnable() {
   @Override
   public void run() { 
      System.out.println("Hello World!!!"); 
   }
}).start();
```

### after
```
new Thread( () -> {
      System.out(
}).start();
```

### 다른 예제
```

/*
 * @FunctionalInterface 
 * public interface Comparator<T>
 * */

Arrays.sort(object, (a, b) -> {
    if (a[1] == b[1]) {
        return a[0] - b[0];
    }
    return a[1] - b[1];
});
```

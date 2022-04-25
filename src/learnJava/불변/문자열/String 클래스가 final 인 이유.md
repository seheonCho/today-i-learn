
## String 클래스가 final 인 이유

### 1. 캐싱 (String Constant Pool) ⭐️

JVM 이 String Constant Pool 영역을 만들고, String 리터럴로 생성된 객체를 공유하여 메모리 사용을 최적화 합니다.

> Java 1.7 이전에는 Heap 영역 내 PermGen --> Java 1.7 부터 Heap 영역

여러 영역에서 `String` 객체를 공유하기 위해서 `String` 클래스는 `immutable` 해야합니다.

#### IDE 에서 권하는 코드로 변경하면, 리터럴 형태로 바꿔준다. ex) `String firstConstructorString = "hello"`
![스크린샷 2022-04-20 오후 3 45 29](https://user-images.githubusercontent.com/86992911/164168083-ddb1db56-5555-42eb-a11a-1287e63eb7a4.png)

#### 명시적 복사본이 필요한게 아니라면 권하지 않고,`immutable` 이라는 주석
![스크린샷 2022-04-20 오후 3 57 58](https://user-images.githubusercontent.com/86992911/164169111-a4711663-96e9-46a1-9af7-378e4309dc6d.png)

### 2. Thread-safe

외부에서 동기화를 고려하지 않고, 스레드간에 안전하게 공유할 수 있다. 

### 3. 보안성

`String` 은 다수의 Java 클래스에 인자로 사용되고 있고, DB, 네트워크 연결 의 호스트, 포트 등으로도 사용하기 때문에, `String`이 `immutable` 하지 않다면, 사용자는 시스템의 특정 파일에 대한 엑세스 권한을 얻은 후 경로, 혹은 주소의 변경이 가능하게 되며, 이것은 보안에 문제가 된다.

### 4. Hash 기반 Collection key

HashMap, Hashtable 같은 해시 기반 컬렉션의 키로써 많이 사용된다.
Immutable 한 HashMap 키는 필수로 요구되진 않지만, 상태 변경의 위험에서 벗어날 수 있다.

## 예제

```
String firstString = "test";
String secondString = "test";

System.out.println(firstString.hashCode());
System.out.println(secondString.hashCode());
System.out.println(firstString == secondString);
System.out.println(firstString.equals(secondString));

System.out.println("===========");

String firstConstructorString = new String("hello");
String secondConstructorString = new String("hello");

System.out.println(firstConstructorString.hashCode());
System.out.println(secondConstructorString.hashCode());
System.out.println(firstConstructorString == secondConstructorString);
System.out.println(firstConstructorString.equals(secondConstructorString));

// 출력값
3556498
3556498
true
true
===========
99162322
99162322
false
true
```

### 출처
https://www.mimul.com/blog/why-string-class-has-made-immutable-or-final-java/

https://www.baeldung.com/java-string-pool#conclusion

https://www.baeldung.com/java-string-constant-pool-heap-stack

https://hayeon17kim.github.io/posts/200810-21/

https://wildeveloperetrain.tistory.com/34
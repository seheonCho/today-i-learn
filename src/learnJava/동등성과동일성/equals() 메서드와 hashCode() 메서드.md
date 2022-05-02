
# equals() 메서드와 hashCode() 메서드

## equals()
> 객체를 비교하는 방법. 객체는 `==` 만으로 같은지 확인이 안되기 때문.

### `equals()` 메서드를 작성하는 방법
1. 재귀 (reflexive)
- null 이 아닌 x 라는 객체의 x.equals(x) 의 결과는 항상 true 이어야 한다.
2. 대칭성 (symmetric)
- null 이 아닌 x 와 y 객체가 잇을 때 x.equals(y) 가 true 라면, y.equals(x) 도 반드시 true 이어야 한다.
3. 타동적 
- null 이 아닌 x, y, z 가 있을 때 x.equals(y) 가 true 이고, y.equals(z) 가 true 라면, x.equals(z)는 반드시 true 를 리턴해야 한다.
4. 일관 (consistent)
- null 이 아닌 x와 y가 있을 때 객체가 변경되지 않은 상황에서는 몇 번을 호출하더라도 x.equals(y) 의 결과는 항상 true 이거나 항상 false 이어야 한다.
5. null 과 비교시 결과가 false 이어야 한다.

### `equals()` 를 재정의 하지 않는다면,
  - `hashCode()` 가 만든 해시값을 이용해, 객체가 저장된 버킷을 찾을 수는 있지만, 해당 객체가 자신과 같은 객체인지 값을 비교할 수 없기 때문에, `null`을 `return` 한다.

## hashCode()
> 객체의 고유값을 나타내며, 객체의 메모리 주소를 16진수로 리턴한다.
> 두 객체가 설 ㅗ동일하면, hashCode() 값은 무조건 동일해야 한다.
> equals() 메서드를 override 하면, hashCode() 메서드도 override 해서 동일한 결과가 나오도록 만들어야 한다.

### `hashCode()` 메서드를 작성하는 방법
- 자바 어플리케이션이 수행되는 동안 어떤 객체에 대해서 항상 동일한 `int` 값을 리턴해야 한다.
  - 다만, 자바가 실행될 때마다 같은 값이 아닐 수도 있다.
- 어떤 두개의 객체에 대해 equals() 메서드를 사용하여 비교한 결과가 true 일 경우에, 두 객체의 hashCode() 메서드는 동일한 `int` 값을 리턴해야 한다.
- 두 객체의 equals() 결과가 false 이어도, hashCode() 메서드의 리턴되는 `int` 값이 다를 무조건 다를 필요는 없다.
  - 다만, 서로 다른 `int` 값을 제공하는 경우 `hashtable` 의 성능을 향상시키는데 도움이 된다.

### `hashCode()` 를 재정의 하지 않는다면?
  - 같은 값의 객체라도, 해시값이 다를 수 있고, `HashMap` 등의 컬렉션에서 객체가 저장된 버킷을 찾을 수 없음.

### 예제
```
public static void main(String[] args) {

    Member member1 = new Member("hello", "이순신", 27);
    Member member2 = new Member("hello", "이순신", 27);

    System.out.println(member1.equals(member2));        // false
    System.out.println("1 ==> " + member1.hashCode());  // 1975012498
    System.out.println("2 ==> " + member2.hashCode());  // 1808253012

    MemberWithEquals memberWithEquals1 = new MemberWithEquals("hello", "이순신", 27);
    MemberWithEquals memberWithEquals2 = new MemberWithEquals("hello", "이순신", 27);

    System.out.println("====================");
    System.out.println(memberWithEquals1.equals(memberWithEquals2)); // true
    System.out.println("1 ==> " + memberWithEquals1.hashCode());     // 589431969
    System.out.println("2 ==> " + memberWithEquals2.hashCode());     // 1252169911

    MemberWithEqualsAndHashCode memberWithEqualsAndHashCode1 = new MemberWithEqualsAndHashCode("hello", "이순신", 27);
    MemberWithEqualsAndHashCode memberWithEqualsAndHashCode2 = new MemberWithEqualsAndHashCode("hello", "이순신", 27);

    System.out.println("====================");
    System.out.println(memberWithEqualsAndHashCode1.equals(memberWithEqualsAndHashCode2));  // true
    System.out.println("1 ==> " + memberWithEqualsAndHashCode1.hashCode());                 // -1918827339
    System.out.println("2 ==> " + memberWithEqualsAndHashCode2.hashCode());                 // -1918827339

}
```

### 예제 설명
1. equals(), hashCode() 메서드를 모두 오버라이딩 하지 않은, Member 클래스 끼리의 비교는 기준이 있지 않다.
2. equals() 메서드를 오버라이딩 한 MemberWithEquals 클래스의 비교는 동등성 확인이 된다.
3. equals(), hashCode() 메서드를 모두 오버라이딩 한 MemberWithEqualsAndHashCode 클래스는 동등성 및 동일성 확인이 되기 때문에, HashMap, HashSet 등 Hash


출처

https://www.baeldung.com/java-equals-hashcode-contracts

https://stackoverflow.com/questions/2265503/why-do-i-need-to-override-the-equals-and-hashcode-methods-in-java

https://jisooo.tistory.com/entry/java-hashcode%EC%99%80-equals-%EB%A9%94%EC%84%9C%EB%93%9C%EB%8A%94-%EC%96%B8%EC%A0%9C-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B3%A0-%EC%99%9C-%EC%82%AC%EC%9A%A9%ED%95%A0%EA%B9%8C

자바의 신 1권
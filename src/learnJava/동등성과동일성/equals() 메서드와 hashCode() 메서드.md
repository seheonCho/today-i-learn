
# equals() 메서드와 hashCode() 메서드

## `equals()` 를 재정의 하지 않는다면,
  - `hashCode()` 가 만든 해시값을 이용해, 객체가 저장된 버킷을 찾을 수는 있지만, 해당 객체가 자신과 같은 객체인지 값을 비교할 수 없기 때문에, `null`을 `return` 한다.

## `hashCode()` 를 재정의 하지 않는다면?
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
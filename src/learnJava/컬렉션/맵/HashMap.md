
# HashMap

- `java.util` 패키지
- 키, 값 쌍으로 데이터를 보관하는 자료구조.
- 삽입, 삭제, 검색의 시간복잡도 O(1)
- 키 의 중복은 허용하지 않지만, 값의 중복은 허용한다.
- `Open Addressing` , `Separate Chaning` 방식이 있다.
  - `Java` 는 `Separate Chaning` 방식을 사용
- Non Thread-Safe

> Open Addrssing : 해시충돌 발생시, 인접 인덱스 값을 새로 구해서 해시충돌을 우회하는 방식

> Separate Chaning : 동일한 해시값이 있을 경우 `LinkedList` 로 관리하고, 8개 이상인 경우 `Tree`로 변경하여 관리.

## 해시 분포와 해시 충돌

동일하지 않은 어떤 객체 `X` 와 `Y` 가 있을 때, 즉 `X.equals(Y)가` '거짓'일 때 `X.hashCode() != Y.hashCode()` 가 같지 않다면, 이때 사용하는 해시 함수는 완전한 해시 함수 (Perfect hash functions)라고 한다

## HashMap 에 put() 메서드로 객체를 추가하는 경우
- 값이 같은 객체가 이미 있다면, 기존 객체를 덮어쓴다.
  - `equals() ` is `true`
- 값이 같은 객체가 없다면, 해당 `entry (키, 값)`를 `LinkedList`에 추가한다.
  - `equals()` is `false`

## HashMap 에 get() 메서드로 객체를 조회하는 경우
- 값이 같은 객체가 있다면, 그 객체를 리턴한다. 
  - `equals()` is `true`
- 값이 같은 객체가 없다면 `null` 을 리턴한다.
  - `equals()` is `false`
  
### `HashMap`, `HashSet` , `HashTable` 의 `key` 가 될 `Class` 의 `equasl()` 와 `hashCode()` 를 같이 재정의 해야 하는 이유
- hashCode() 의 결과값을 가져와서, 중복이면 대체하고, 아니면 put() 하는 형태.
```
public V put(K key, V value) {
    return putVal(hash(key), key, value, false, true);
}

static final int hash(Object key) {
    int h;
    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
```

## 로드팩터란 (LoadFactor)
(데이터의 개수) / (저장 공간) 을 의미한다. 데이터의 개수가 증가하여, 로드팩터보다 커지면, 저장 공간의 크기는 증가되고, 해시 재정리 작업(rehash)을 해야 한다.
데이터가 해시 재정리 작업에 들어가면, 내부에 갖고 있는 자료 구조를 다시 생성하는 단계를 거쳐야 하므로, 성능에 영향이 발생한다.
로드 팩터 값이 클수록 공간은 넉넉해지지만, 데이터를 찾는 식나은 증가한다. 따라서, 초기 공간 개수와 로드 팩터는 데이터의 크기를 고려하여 산정하는 것이 좋다.

### 예제
1. Human Class 는 equals(), hashCode() 를 재정의 했다.
2. Animal Class 는 재정의 하지 않았다.
```
public static void main(String[] args) {
    Human human1 = new Human("홍길동", 27);
    Human human2 = new Human("홍길동", 27);

    System.out.println(human1 == human2);
    System.out.println(human1.equals(human2));
    System.out.println(human1.hashCode());
    System.out.println(human2.hashCode());

    System.out.println("--------------");

    Animal animal1 = new Animal("낙타", 27);
    Animal animal2 = new Animal("낙타", 27);

    System.out.println(animal1 == animal2);
    System.out.println(animal1.equals(animal2));
    System.out.println(animal1.hashCode());
    System.out.println(animal2.hashCode());

    System.out.println("--------------");

    Map<Human, Integer> humanMap = new HashMap<>();
    humanMap.put(human1, 1);
    humanMap.put(human2, 2);
    Map<Animal, Integer> animalMap = new HashMap<>();
    animalMap.put(animal1, 1);
    animalMap.put(animal2, 2);

    System.out.println(humanMap.size());
    System.out.println(animalMap.size());
}

// 출력
false
true
1678651949
1678651949
--------------
false
false
1975012498
1808253012
--------------
1
2
```

## 해시 버킷

출처

https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html

https://jisooo.tistory.com/entry/java-hashcode%EC%99%80-equals-%EB%A9%94%EC%84%9C%EB%93%9C%EB%8A%94-%EC%96%B8%EC%A0%9C-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B3%A0-%EC%99%9C-%EC%82%AC%EC%9A%A9%ED%95%A0%EA%B9%8C

https://leoheo.github.io/java-hashcode-equlas/
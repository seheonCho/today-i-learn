
# HashMap

- `java.util` 패키지
- 키, 값 쌍으로 데이터를 보관하는 자료구조.
- 삽입, 삭제, 검색의 시간복잡도 O(1)
- 키 의 중복은 허용하지 않지만, 값의 중복은 허용한다.
- `Open Addressing` , `Separate Chaning` 방식이 있다.
  - `Java` 는 `Separate Chaning` 방식을 사용
- Non Thread-Safe

> Separate Chaning : 동일한 해시값이 있을 경우 LinkedList로 관리하고, 8개 이상인 경우 Tree로 변경하여 관리.


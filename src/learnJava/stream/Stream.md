
# Stream
- 연속된 정보를 처리하는데 사용
- Java 8에서 새로 추가 되었음
- 코드가 간결해짐
- 성능상 손실은 있을수 있으나, 유지보수적인 측면 등 이점이 많음

## Stream 의 구조
1. 스트림 생성
   - 컬렉션의 목록을 스트림 객체로 변환함
2. 중간 연산 (생략 가능)
  - 데이터를 가공할 때 사용되며, 연산 결과로 Stream 타입을 리턴함, 따라서 여러개의 중간 연산을 사용 가능
3. 종단 연산
   - 스트림 처리를 마뮐 하기위해, 숫자값이나 목록형 데이터를 리턴함.

## Stream 의 각 연산의 종류

- 중간 연산
  - filter() : 데이터를 조건으로 거를 때 사용
  - map(), mapToInt(), mapToLong(), mapToDouble() : 데이터를 특정 데이터로 변환
  - flatMap(), flatMapToInt(), flatMapToLong(), flatMapToDouble() : Stream 데이터를 잘라서 새로운 스트림 제공
  - distinct() : 중복제거, (정렬된 Stream 객체에서 사용하는걸 권장)
  - sorted() : 정렬
  - peek()
  - limit(long maxSize) : 인자값보다 길지 않게 스트림 크기를 자른다.
  - skip(long n) : 스트림의 처음 `n`개 요소를 버린 후 이 스트림의 나머지 요소로 구성된 스트림을 반환한다. 이 스트림에 `n`개 미만의 요소가 포함되어 있으면 빈 스트림을 반환한다.

- 종단 연산
  - forEach(), forEachOrdered() : for 루프를 수행하는 것처럼 각각의항목에 접근
  - toArray(-factory) : 배열로 변환
  - reduce() / reduce() : 결과를 취합
  - collect() : 원하는 타입으로 리턴
  - min(), max(), count()
  - anyMatch() / allMatch() / noneMatch() : 일치하는 것을 찾음
  - findFirst / finAny() : 스트림의 첫 항목이나, 순서 상관없는 없이 찾음


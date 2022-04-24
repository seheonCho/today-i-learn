# 자바에서 소수를 표현하는 방법
- 세 영역으로 구분되어짐
  - 부호 / 지수부 / 가수부
  - 부호부 : `1 == 음수` , `0 == 양수`

## ~~1. 고정 소수점 방식~~
- 제한된 자릿수로 인하여 표현 가능한 실수의 범위와 정밀도가 제한적이다.
- 잘 사용하지 않음.

---

## 2. 부동 소수점 방식
- java 는 IEEE 754 표준
- 소수점 위치의 이동이 가능함.

### float `4byte == 32bit`
- 부호부 `1bit` / 지수부 `8bit` / 가수부 `23bit` 
- 수 뒤에 `f` 를 붙여줘야한다.
- 범위 : `1.17e-38` ~ `3.40e+38`

```
float floatNumber = 1.23f;
```

### double `8byte == 64bit`
- 부호부 `1bit` / 지수부 `11bit` / 가수부 `52bit`
- 범위 : `2.22e-308` ~ `1.79e+308`

```
double doubleNumber = 1.23;
```

---

## 돈과 관련된 연산시 근사값으로 처리되기 때문에, 사용하지 않는다.

- 예제
```
public static void main(String[] args) {

    float aFloatNum = 1.12f;
    double aDoubleNum = 1.12;
    
    System.out.println(aFloatNum);
    System.out.println(aDoubleNum);
    
    aFloatNum += 0.12;
    aDoubleNum += 0.12;
    
    System.out.println(aFloatNum);
    System.out.println(aDoubleNum);
    
    // 출력
    1.12
    1.12
    1.24
    1.2400000000000002
}
```

float , double 두 실수자료형은 연산시 위와 같은, 오차가 발생하기 때문에 작은 숫자도 중요한 돈과 관련된 처리시, 
`BigDecimal` 클래스를 사용하는게 좋다.

# Exception

## CheckedException
- `RuntimeException` 클래스를 상속받지 않는, `Exception` 클래스의 하위 클래스.
- 실행 이전에 예외를 처리해야함

## UnCheckedException
`RuntimeException` 클래스를 상속받는 클래스.
- 명시적인 처리를 강제하지 않음
  ![스크린샷 2022-04-23 오전 2 02 14](https://user-images.githubusercontent.com/86992911/164761030-81a233b8-8edd-4206-8b43-4a6236edb096.png)

---

## Exception 처리 방법
- `CheckedException` 의 경우 아래의 방법 중 한 가지 방법을 반드시 선택해야 한다.

### 방법 1 : `try ~`

1. `try` : Exception 발생 가능성이 있는 코드 (필수)
2. `catch` : 발생한 Exception 처리 코드 (필수)
3. `finally` : Exception 발생 유무 관계없이 처리될 코드

```
try {
    FileInputStream theFile = new FileInputStream("src/test");
} catch (FileNotFoundException fileNotFoundException) {
    fileNotFoundException.printStackTrace();
} finally {
    // Exception 발생 관계없이 수행되는 코드
}
```

### 방법 2 : `throws`

- 사진과 같이 메서드 선언시, `throws` 작성하여, 해당 메서드를 호출한 곳에서 예외를 처리하게 할 수도 있다.
![스크린샷 2022-04-23 오전 1 39 16](https://user-images.githubusercontent.com/86992911/164757583-2d869356-09da-49b8-9e8f-96af5e1546a7.png)

- 위에서 `throws` 한 `IOException` 을 처리하라는 IDE 의 안내 ( `IOException` 은 `CheckedException` 이기 때문에 )
![스크린샷 2022-04-23 오전 1 39 06](https://user-images.githubusercontent.com/86992911/164757564-6f147311-b3a4-4ea2-8648-9a5766f17693.png)

- 처리할 `Exception` 을 다시 `throws` 할 수도 있고, `try ~` 을 통해 처리 할 수도 있다.


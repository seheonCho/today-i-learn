## Call by value 와 Call by Reference

### Call by value
- 변수의 값을 복사해 메서드의 매개변수로 전달 하는것

### Call by reference
- 객체를 참조하는 주소를 메세드의 매개변수로 전달 하는것

```

public static void main(String[] args) {
        Cat firstCat = new Cat("Nero");
        Cat secondCat = new Cat("Nabi");

        System.out.println(firstCat.name + " / " + firstCat);
        System.out.println(secondCat.name + " / " + secondCat);

        swapCat(firstCat, secondCat);

        System.out.println(firstCat.name + " / " + firstCat);
        System.out.println(secondCat.name + " / " + secondCat);

    }

    static void swapCat(Cat firstCat, Cat secondCat) {
        System.out.println("==== swapCat(Cat firstCat, Cat secondCat) start ====");

        System.out.println(firstCat.name + " / " + firstCat);
        System.out.println(secondCat.name + " / " + secondCat);

        Cat tempCat = firstCat;
        firstCat = secondCat;
        secondCat = tempCat;

        System.out.println(firstCat.name + " / " + firstCat);
        System.out.println(secondCat.name + " / " + secondCat);

        System.out.println("==== swapCat(Cat firstCat, Cat secondCat) start ====");

    }
}
    
/*** 출력값 ***/
Nero / learnJava.callByValue_callByReference.Cat@75b84c92
Nabi / learnJava.callByValue_callByReference.Cat@6bc7c054
==== swapCat(Cat firstCat, Cat secondCat) start ====
Nero / learnJava.callByValue_callByReference.Cat@75b84c92
Nabi / learnJava.callByValue_callByReference.Cat@6bc7c054
Nabi / learnJava.callByValue_callByReference.Cat@6bc7c054
Nero / learnJava.callByValue_callByReference.Cat@75b84c92
==== swapCat(Cat firstCat, Cat secondCat) start ====
Nero / learnJava.callByValue_callByReference.Cat@75b84c92
Nabi / learnJava.callByValue_callByReference.Cat@6bc7c054
```

## 결론
> 자바는 Call by value 이다.

- 자바는 객체(참조 타입)를 메서드의 인자로 넘길 때 참조하는 지역변수의 실제 주소를 넘기는 것이 아니라, 그 지역변수가 가리키고 있는 힙 영역의 객체를 가리키는 새로운 지역변수를 생성하여, 그것을 통해 같은 객체를 가리키도록 하는 방식임을 알 수 있다.
- 새로운 지역변수를 생성해 이루어지기 때문에 기본 타입을 매개변수로 받아 값을 바꾼 경우와 참조타입을 매개변수로 받아 값을 변경한 경우 모두 스택에서 변경이 이루어지기 때문에 아무런 의미가 없다.
- 기본적으로 자바에서의 메서드 호출은 참조 자료형, 기본 자료형 모두 Call by value 방식이며, 객체의 경우 객체를 가리키는 주소 값을 넘겨 새로운 지역변수를 통해 Call by value 로 객체를 참조해 모든 메서드와 필드를 호출해 실행이 된다.
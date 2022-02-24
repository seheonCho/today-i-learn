package learnJava.디자인패턴.템플릿메서드패턴;

public class AfterLaptop extends Computer {

    // 추상 메서드를 오버라이딩
    @Override
    void chargePower() {
        System.out.println("콘센트와 충전기 사용");
    }

    // Hook(갈고리) 메서드 오버라이딩
    @Override
    void manipulation() {
        System.out.println("트랙패드 사용");
    }
}

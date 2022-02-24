package learnJava.디자인패턴.템플릿메서드패턴;

public class AfterDesktop extends Computer {

    @Override
    void chargePower() {
        System.out.println("콘센트와 전원플러그 사용");
    }

    @Override
    void manipulation() {
        System.out.println("마우스 사용");
    }
}

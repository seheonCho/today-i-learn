package learnJava.디자인패턴.전략패턴;

public class StrategyBow implements Strategy {

    @Override
    public void runStrategy() {
        System.out.println("전략 인터페이스를 오버라이딩한 활");
    }

}

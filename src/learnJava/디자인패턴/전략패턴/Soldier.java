package learnJava.디자인패턴.전략패턴;

public class Soldier {

    void runContext(Strategy theStrategy) {
        System.out.println("시작");
        theStrategy.runStrategy();
        System.out.println("종료");
    }

}

package learnJava.디자인패턴.전략패턴;

public class Client {

    public static void main(String[] args) {

        Strategy theStrategy = null;
        Soldier theSoldier = new Soldier();

        // 총을 전달하는 전략
        theStrategy = new StrategyGun();
        theSoldier.runContext(theStrategy);

        // 칼을 전달하는 전략
        theStrategy = new StrategySword();
        theSoldier.runContext(theStrategy);

        // 활을 전달하는 전략
        theStrategy = new StrategyBow();
        theSoldier.runContext(theStrategy);

    }

}

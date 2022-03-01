package learnJava.디자인패턴.템플릿콜백패턴;

public class Soldier {

    void runContext(Strategy theStrategy) {
        System.out.println("시작");
        theStrategy.runStrategy();
        System.out.println("종료");
    }

    void runContextRefactor(String weaponCategory) {
        System.out.println("시작");
        executeWeapon(weaponCategory).runStrategy();
        System.out.println("종료");
    }

    private Strategy executeWeapon(final String weaponCategory) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponCategory);
            }
        };
    }

}

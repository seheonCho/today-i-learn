package learnJava.디자인패턴.템플릿콜백패턴;

public class Client {

    public static void main(String[] args) {

        Strategy theStrategy = null;
        Soldier theSoldier = new Soldier();

        theSoldier.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총");
            }
        });


        theSoldier.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("칼");
            }
        });

        theSoldier.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("활");
            }
        });

        // 중복을 줄이는 리팩토링을 한 방법
        theSoldier.runContextRefactor("도끼");

    }

}

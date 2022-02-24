package learnJava.디자인패턴.템플릿메서드패턴;

public class User {

    public static void main(String[] args) {

        Computer desktop = new AfterDesktop();
        desktop.playGame();

        Computer laptop = new AfterLaptop();
        laptop.playGame();

    }

}

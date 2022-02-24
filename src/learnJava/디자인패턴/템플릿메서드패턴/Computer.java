package learnJava.디자인패턴.템플릿메서드패턴;

public abstract class Computer {

    // 템플릿 메서드
    public void playGame() {
        chargePower();
        System.out.println("게임 키기");
        System.out.println("게임 시작");
    }

    abstract void chargePower();

    // Hook(갈고리) 메서드
    void manipulation() {
        System.out.println("조작");
    }

}

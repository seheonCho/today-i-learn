package learnJava.추상클래스_인터페이스;

public abstract class Human extends Creature implements Talkable {

    public Human(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void attack() {
        System.out.println("도구 사용 공격!");
    }

    @Override
    public void talk() {
        System.out.println("사람의 말");
    }
}
package learnJava.추상클래스_인터페이스;

public abstract class Animal extends Creature {

    public Animal(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void attack() {
        System.out.println("공격! 공격!");
    }

}

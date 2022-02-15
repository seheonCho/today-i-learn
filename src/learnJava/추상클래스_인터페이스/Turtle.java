package learnJava.추상클래스_인터페이스;

public class Turtle extends Animal implements Swimable {

    public Turtle(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
    }

    @Override
    public void printInfo() {
        System.out.println("Turtle -> " + toString());
    }
}

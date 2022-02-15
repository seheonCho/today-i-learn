package learnJava.추상클래스_인터페이스;

public class Kevin extends Human implements Programmer, Swimable {

    public Kevin(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void coding() {
        System.out.println("Hello World!!!");
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
    }

    @Override
    public void printInfo() {
        System.out.println("Keven -> " + toString());
    }
}

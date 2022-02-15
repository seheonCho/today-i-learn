package learnJava.추상클래스_인터페이스;

public abstract class Creature {

    private int x;
    private int y;
    private int age;

    public Creature(int x, int y, int age) {
        this.x = x;
        this.y = y;
        this.age = age;
    }

    public void age() {
        this.age++;
    }

    public void move(int xDistance) {
        this.x += xDistance;
    }

    public abstract void attack();
    public abstract void printInfo();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAge() {
        return age;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "x=" + x +
                ", y=" + y +
                ", age=" + age +
                '}';
    }

}

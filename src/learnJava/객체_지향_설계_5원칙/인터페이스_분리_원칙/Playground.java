package learnJava.객체_지향_설계_5원칙.인터페이스_분리_원칙;

public class Playground {

    public static void main(String[] args) {
        Son aMan = new Man();

        // Man 클래스는 4가지의 인터페이스를 상속 했으나,
        // Son 인터페이스를 객체화 했기 때문에, 아래 두가지 메서드만 사용 가능.
        aMan.beingGoodSon();
        aMan.message();

    }

}

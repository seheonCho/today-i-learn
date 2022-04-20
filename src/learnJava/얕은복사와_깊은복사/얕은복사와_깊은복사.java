package learnJava.얕은복사와_깊은복사;

public class 얕은복사와_깊은복사 {

    public static void main(String[] args) throws CloneNotSupportedException {

        // 기본 자료형의 깊은 복사
        int a = 100;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        a = 200;

        System.out.println(a);
        System.out.println(b);

        // 객체의 얕은복사
        Human originalHuman = new Human("홍길동", 20);
        Human newHuman = originalHuman;
        // 객체의 깊은 복사 방법 -> Cloneable interface
        Human cloneHuman = (Human) originalHuman.clone();

        System.out.println(originalHuman.getName());
        System.out.println(newHuman.getName());

        originalHuman.setName("이순신");

        System.out.println(originalHuman.getName());
        System.out.println(newHuman.getName());
        System.out.println(cloneHuman.getName());

//        출력값
//        100
//        100
//        200
//        100
//        홍길동
//        홍길동
//        이순신
//        이순신
//        홍길동

    }

}

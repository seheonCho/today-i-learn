package learnJava.디자인패턴.싱글턴패턴;

public class Client {

    public static void main(String[] args) {

        // private 생성자가 존재해서, new를 통해 인스턴스를 생성 할 수 없게 만들었음. [Singleton.class:8] 참조
        // Singleton theSingleton = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        // 객체 참조 변수를 System.out.println() 을 통해 출력하면, 별도의 toString() 메서드를 오버라이딩 하지 않는 이상, 객체의 hashcode가 반환된다.
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }

}

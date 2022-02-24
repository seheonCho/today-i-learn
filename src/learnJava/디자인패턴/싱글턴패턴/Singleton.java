package learnJava.디자인패턴.싱글턴패턴;

public class Singleton {

    // 3. 정적 참조 변수
    static Singleton singleton;

    // 1. new 생성을 막는 private 생성자
    private Singleton() {}

    // 2. 객체 반환 메서드
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}

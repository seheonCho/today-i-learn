package learnJava.static이란;

public class InitClass {

    static final int TEST_NUMBER;

    static {
        System.out.println("start static...");
    }

    static {
        TEST_NUMBER = 100;
        System.out.println(TEST_NUMBER);
    }

    static {
        System.out.println("end static..");
    }

    static int sumNumber(int a, int b) {
        return a + b;
    }

}

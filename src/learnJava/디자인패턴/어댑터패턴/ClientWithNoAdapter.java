package learnJava.디자인패턴.어댑터패턴;

public class ClientWithNoAdapter {

    public static void main(String[] args) {
        ServiceA sa1 = new ServiceA();
        ServiceB sb1 = new ServiceB();

        sa1.runServiceA();
        sb1.runServiceB();
    }

}

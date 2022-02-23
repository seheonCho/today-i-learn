package learnJava.디자인패턴.어댑터패턴;

public class ClientWithAdapter {

    public static void main(String[] args) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();

        asa1.runService();
        asb1.runService();
    }

}

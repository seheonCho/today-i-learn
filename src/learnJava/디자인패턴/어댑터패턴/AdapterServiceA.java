package learnJava.디자인패턴.어댑터패턴;

public class AdapterServiceA {

    ServiceA sa1 = new ServiceA();

    void runService() {
        sa1.runServiceA();
    }

}

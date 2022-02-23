package learnJava.디자인패턴.어댑터패턴;

import learnJava.디자인패턴.프록시패턴.Service;

public class AdapterServiceB {
    ServiceB sb1 = new ServiceB();

    void runService() {
        sb1.runServiceB();
    }
}

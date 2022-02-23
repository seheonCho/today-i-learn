package learnJava.디자인패턴.프록시패턴;

public class Service implements IService {
    @Override
    public String runSomething() {
        return "Service";
    }
}

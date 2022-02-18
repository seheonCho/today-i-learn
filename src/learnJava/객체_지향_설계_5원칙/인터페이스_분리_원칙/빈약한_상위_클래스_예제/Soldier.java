package learnJava.객체_지향_설계_5원칙.인터페이스_분리_원칙.빈약한_상위_클래스_예제;

import java.util.Date;

public class Soldier extends Human {

    public Date birth;
    public String uniqueNumber;
    public String soldierNumber;

    public Soldier(String name, Date birth, String uniqueNumber, String soldierNumber) {
        super(name);
        this.birth = birth;
        this.uniqueNumber = uniqueNumber;
        this.soldierNumber = soldierNumber;
    }

    public void sleep() {}
    public void introduce() {}
    public void train() {}

    @Override
    public void eat() {}
}

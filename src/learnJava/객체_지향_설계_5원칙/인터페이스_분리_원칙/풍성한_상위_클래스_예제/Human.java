package learnJava.객체_지향_설계_5원칙.인터페이스_분리_원칙.풍성한_상위_클래스_예제;

import java.util.Date;

public class Human {

    public String name;
    public Date birth;
    public String uniqueNumber;

    public Human(String name, Date birth, String uniqueNumber) {
        this.name = name;
        this.birth = birth;
        this.uniqueNumber = uniqueNumber;
    }

    public void eat() {}

    public void sleep() {}

    public void introduce() {}

}

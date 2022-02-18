package learnJava.객체_지향_설계_5원칙.인터페이스_분리_원칙.빈약한_상위_클래스_예제;

import java.util.Date;

public class Student extends Human {

    public Date birth;
    public String uniqueNumber;
    public String studentNumber;

    public Student(String name, Date birth, String uniqueNumber, String studentNumber) {
        super(name);
        this.birth = birth;
        this.uniqueNumber = uniqueNumber;
        this.studentNumber = studentNumber;
    }

    public void sleep() {}

    public void introduce() {}

    public void study() {}

    @Override
    public void eat() {}

}

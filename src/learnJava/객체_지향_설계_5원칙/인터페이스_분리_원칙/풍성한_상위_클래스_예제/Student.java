package learnJava.객체_지향_설계_5원칙.인터페이스_분리_원칙.풍성한_상위_클래스_예제;

import java.util.Date;

public class Student extends Human {

    public String studentNumber;

    public Student(String name, Date birth, String uniqueNumber, String studentNumber) {
        super(name, birth, uniqueNumber);
        this.studentNumber = studentNumber;
    }

    public void study() {}

}

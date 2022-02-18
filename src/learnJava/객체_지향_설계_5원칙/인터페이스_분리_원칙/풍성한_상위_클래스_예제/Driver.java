package learnJava.객체_지향_설계_5원칙.인터페이스_분리_원칙.풍성한_상위_클래스_예제;

import java.util.Date;

public class Driver {

    public static void main(String[] args) {
        Human kimStudent = new Student("김학생",
                new Date(System.currentTimeMillis()),
                "20000101-1234567",
                "20190001");

        Human leeSoldier = new Soldier("이군인",
                new Date(System.currentTimeMillis()),
                "19981231-1234567",
                "19012345678");

        System.out.println(kimStudent.name);
        System.out.println(leeSoldier.name);

        System.out.println(kimStudent.birth);
        System.out.println(leeSoldier.birth);

        System.out.println(kimStudent.uniqueNumber);
        System.out.println(leeSoldier.uniqueNumber);

//        System.out.println(kimStudent.studentNumber); // 사용불가
//        System.out.println(leeSoldier.soldierNumber); // 사용불가

        System.out.println(((Student) kimStudent).studentNumber); // 캐스팅 필요
        System.out.println(((Soldier) leeSoldier).soldierNumber); // 캐스팅 필요

        kimStudent.eat();
        leeSoldier.eat();

        kimStudent.sleep();
        leeSoldier.sleep();

        kimStudent.introduce();
        leeSoldier.introduce();

//        kimStudent.study(); // 사용불가
//        leeSoldier.train(); // 사용불가

        ((Student) kimStudent).study(); // 캐스팅 필요
        ((Soldier) leeSoldier).train(); // 캐스팅 필요



    }

}
package learnJava.객체_지향_설계_5원칙.인터페이스_분리_원칙.빈약한_상위_클래스_예제;

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
                "19-12345678");

        System.out.println(kimStudent.name);
        System.out.println(leeSoldier.name);

        System.out.println(((Student) kimStudent).birth);
        System.out.println(((Soldier) leeSoldier).birth);

//        System.out.println(kimStudent.uniqueNumber); => FAIL 형변환 하거나, Human 클래스에 uniqueNumber 필드가 필요함
        System.out.println(((Student) kimStudent).uniqueNumber);

//        System.out.println((leeSoldier.uniqueNumber); => FAIL, 형변환 하거나, Human 클래스에 uniqueNumber 필드가 필요함
        System.out.println(((Soldier) leeSoldier).uniqueNumber);

//        System.out.println(kimStudent.uniqueNumber); // FAIL
//        System.out.println(leeSoldier.uniqNumber); // FAIL

        System.out.println(((Student) kimStudent).uniqueNumber);
        System.out.println(((Soldier) leeSoldier).uniqueNumber);

        kimStudent.eat();
        leeSoldier.eat();

//        kimStudent.sleep(); // FAIL
//        leeSoldier.sleep(); // FAIL

        ((Student) kimStudent).sleep(); //캐스팅 필요
        ((Soldier) leeSoldier).sleep(); //캐스팅 필요

//        kimStudent.introduce(); //
//        leeSoldier.introduce(); //

        ((Student) kimStudent).introduce();
        ((Soldier) leeSoldier).introduce();

//        kimStudent.study(); // 캐스팅 필요
//        leeSoldier.train(); // 캐스팅 필요;

        ((Student) kimStudent).study();
        ((Soldier) leeSoldier).train();
    }

}

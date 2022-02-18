package learnJava.객체_지향_설계_5원칙.단일_책임_원칙.단일_책임_원칙을_지키지_않은_경우;

public class 학생 {

    final static boolean 컴퓨터공학과 = true;
    final static boolean 생명공학과 = true;
    boolean 전공;

    void 공부() {

        if (this.전공 == 컴퓨터공학과) {
            // 컴퓨터공학 전공 커리큘럼 기반 공부를 한다.
        } else {
            // 컴퓨터공학 전공 커리큘럼 기반과 다른 공부를 한다.
        }

    }

}

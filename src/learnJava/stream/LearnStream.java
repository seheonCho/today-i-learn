package learnJava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnStream {

    public static void main(String[] args) {

        LearnStream learnStream = new LearnStream();

        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("유관순", 17, 100, 1.2f));
        studentList.add(new StudentDTO("이순신", 21, 98, 1.3f));
        studentList.add(new StudentDTO("홍길동", 23, 95, 1.4f));
        learnStream.printStudentsName(studentList);

        learnStream.filterWithScorePrintName(studentList);


        // 모든 수에 3을 곱해 출력하는 예제
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 1. 기존 for 루프를  활용
        for (int num : numbers) System.out.println(num * 3);

        // 2. Stream 활용
        numbers.stream().forEach(num -> System.out.println(num * 3));

        // 3. Stream map 을 활용하여, 데이터 자체를 변경
        numbers.stream().map(num -> num * 3).forEach(num -> System.out.println(num));

        // 4. Stream map 활용하여, 데이터 자체를 변경 및, 메서드 참조까지 하여 코드를 리팩토링
        numbers.stream().map(num -> num * 3).forEach(System.out::println);
        
    }

    // 이름 출력 메서드
    public void printStudentsName(List<StudentDTO> students) {

        //  1. Stream 이 아닌, 기존의 방식
         for (StudentDTO student : students) System.out.println(student.getName());

        // 2. Stream 만 사용한 방식
        students.stream().forEach(student -> System.out.println(student.getName()));

        // 3. Stream 과 메서드 참조를 이용한 방식
        students.stream().forEach(System.out::println);

        // 4. Stream 과 map() 메서드를 사용한 방식
        students.stream().map(student -> student.getName()).forEach(name -> System.out.println(name));
    }

    private void filterWithScorePrintName(List<StudentDTO> studentList) {
        int referenceScore = 97;
        for (StudentDTO student : studentList) {
            if (student.getScoreAverage() > referenceScore) {
                System.out.println("[for loop] over ref score! " + student.getName());
            }
        }

        studentList.stream()
                .filter(student -> student.getScoreAverage() > referenceScore)
                .forEach(student -> System.out.println("[Stream forEach] over ref score! " + student.getName()));
    }

}

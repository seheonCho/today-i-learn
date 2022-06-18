package learnJava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnArrayToList {

    public static void main(String[] args) {

        // 배열을 Stream List 형태로 변환하는 방법
        Integer[] numbers = {1, 3, 5};

        List<Integer> numberList1 = new ArrayList<>(Arrays.asList(numbers));

        List<Integer> numberList2 = Arrays.stream(numbers).collect(Collectors.toList());

    }

}

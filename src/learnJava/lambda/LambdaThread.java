package learnJava.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaThread {

    public static void main(String[] args) {

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Hi Thread");
            }

        });

        List<String> fruits = Arrays.asList("apple", "banana", "melon");

        fruits.forEach(fruit -> { System.out.println(fruit); });

        System.out.println("===========");

        // 지연연산
        fruits.stream().filter(s -> s.contains("a")).forEach(s -> System.out.println(s));

    }

}

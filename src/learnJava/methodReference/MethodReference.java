package learnJava.methodReference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

    public MethodReference() {}

    public MethodReference(String string) {}

    public static void main(String[] args) {

        int numberA = 10;
        int numberB = 20;

        System.out.println(Integer.sum(numberA, numberB));

        TestMethodReference testMethodReference = Integer::sum;
        System.out.println(testMethodReference.sum(numberA, numberB));

        // 생성자 메서드 인자가 없을 때
        Supplier<MethodReference> supplier = MethodReference::new;
        MethodReference methodReference1 = supplier.get();

        // 생성자 메서드 인자가 있을 때
        Function<String, MethodReference> function = MethodReference::new;
        MethodReference methodReference2 = function.apply("test");

    }

}

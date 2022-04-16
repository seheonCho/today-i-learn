package learnJava.박싱_언박싱;

public class BoxingAndUnBoxing {

    public static void main(String[] args) {
        Integer firstInteger = new Integer(1);
        Integer secondInteger = new Integer(2);

        // Auto unboxing
        int firstBoxing = firstInteger;

        // Unboxing
        int secondBoxing = (int) firstInteger;

        // Auto boxing
        Integer firstUnBoxing = firstBoxing;

        // Boxing
        Integer secondUnBoxing = (Integer) secondInteger;
    }

}

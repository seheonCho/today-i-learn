package learnJava.불변.문자열;

public class WhyStringIsFinal {

    public static void main(String[] args) {

        String firstString = "test";
        String secondString = "test";

        System.out.println(firstString.hashCode());
        System.out.println(secondString.hashCode());
        System.out.println(firstString == secondString);
        System.out.println(firstString.equals(secondString));

        System.out.println("===========");

        String firstConstructorString = new String("hello");
        String secondConstructorString = new String("hello");

        System.out.println(firstConstructorString.hashCode());
        System.out.println(secondConstructorString.hashCode());
        System.out.println(firstConstructorString == secondConstructorString);
        System.out.println(firstConstructorString.equals(secondConstructorString));

    }

}

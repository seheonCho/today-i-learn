package learnJava.어노테이션;

public class LearnAnnotation {

    @TestAnnotation(number = 3)
    public int sumNumber(int a, int b) {
        return a + b;
    }

    @TestAnnotation(number = 2, text = "This is numbers multiple Method")
    public int multipleNumber(int ... nums) {
        int sum = 1;
        for (int num : nums) {
            sum *= num;
        }
        return sum;
    }

}

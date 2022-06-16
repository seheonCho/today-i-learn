package learnJava.lambda;

public class LearnLambda {

    public static void main(String[] args) {

        System.out.println("Not use lambda expression");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi Thread");
            }
        });

        System.out.println("Use lambda expression");
        new Thread( () -> System.out.println("Hello World!!!"));

        System.out.println("=====");

        LambdaTest lambdaTest1 = new LambdaTest() {
            @Override
            public int sumInt(int a, int b) {
                return a + b;
            }
        };

        LambdaTest lambdaTest2 = (a1, b1) -> a1 + b1;
        System.out.println(lambdaTest2.sumInt(4, 5));

    }

}

package learnJava.fork_join;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinSample2 {

    static final ForkJoinPool mainPool = new ForkJoinPool();
    public static void main(String[] args) {
        ForkJoinSample2 sample = new ForkJoinSample2();
        sample.calculate();
    }

    private void calculate() {
        long from = 0L;
        long to = 10000L;

        ImprovedGetSum sum = new ImprovedGetSum(from, to);
        long result = mainPool.invoke(sum);
        System.out.println("Fork Join:Total sum of " + from + " ~ " + to + " = " + result);
    }
}

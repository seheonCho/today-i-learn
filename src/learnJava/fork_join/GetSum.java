package learnJava.fork_join;

import java.util.concurrent.RecursiveTask;

public class GetSum extends RecursiveTask<Long> {

    long from;
    long to;

    public GetSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        long gap = to - from;

        if (gap <= 3) {
            long tempSum = 0;
            for (long i = from; i <= to; i++) {
                tempSum += i;
            }
            return tempSum;
        }

        long middle = (from + to) / 2;
        GetSum sumPre = new GetSum(from, middle);
        sumPre.fork();
        GetSum sumPost = new GetSum(middle + 1, to);
        return sumPost.compute() + sumPre.join();
    }

    public void log(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "]: " + message);
    }

}

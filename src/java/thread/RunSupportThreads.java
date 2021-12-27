package java.thread;

public class RunSupportThreads {

    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkThreadState1();
    }

    private void checkThreadState1() {

        SleepThread thread = new SleepThread(2000);

        try {
            System.out.println("thread state=" + thread.getState());
            thread.start();
            System.out.println("thread state(after start)=" + thread.getState());

            Thread.sleep(1000);
            System.out.println("thread state(after 1 sec)=" + thread.getState());

            thread.join();
            thread.interrupt();
            System.out.println("thread satete(after join)="+thread.getState());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }





}

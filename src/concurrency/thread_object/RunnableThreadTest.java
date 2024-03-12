package concurrency.thread_object;

public class RunnableThreadTest {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Thread1());
        Thread th2 = new Thread(new Thread2());

        // Set Priority
        th1.setPriority(10);
        th2.setPriority(5);

        th1.start();
        th2.start();
    }
}

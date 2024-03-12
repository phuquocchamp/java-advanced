package concurrency.utilities;

public class PrintThread {
    public static void printInfo(Thread thread) {
        System.out.println("Thread ID : " + thread.getId()
                + "\nThread Name : " + thread.getName()
                + " \nThread State : " + thread.getState()
                + "\nThread Priority : " + thread.getPriority()
                + "\nThread Alive : " + thread.isAlive()
                + "\nThread Group : " + thread.getThreadGroup()
                + "\n------------------------------------------------"
        );
    }
}

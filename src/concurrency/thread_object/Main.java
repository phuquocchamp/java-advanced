package concurrency.thread_object;

public class Main {

    public static void printThread(Thread thread){
        System.out.println("Thread ID : " + thread.getId());
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread State: " + thread.getState());
        System.out.println("Thread Priority : " + thread.getPriority());
    }
    public static void main(String[] args) throws InterruptedException {
        // t3 - 0
        // t4 - 1
        // t5 - 2

        Thread t3 = new Thread(new Thread3());
        Thread t4 = new Thread(new Thread4());
        Thread t5 = new Thread(new Thread5());


//        Runnable runnable = () -> {
//            for(int i = 1; i<= 10; i++){
//                System.out.print(" 0 ");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };

        Thread t6 = new Thread(() -> {
            for(int i = 1; i<= 10; i++){
                System.out.print(" 3 ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t3.start();
        t4.start();
        t5.start();
        t6.start();


    }
}

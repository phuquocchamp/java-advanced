package concurrency.thread_object;

import concurrency.utilities.PrintThread;

import java.util.concurrent.TimeUnit;

public class SimpleThread {
    public static void main(String[] args) {


        Runnable t1 = () -> {
            for (int i = 1; i <= 5; ++i){
                System.out.println("t1 count : " + i);
                try{
                    TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }

            }
        };

        Runnable t2 = () -> {
            for (int i = 1; i <= 5; ++i){
                System.out.println("t2 count : " + i);
                try{
                    TimeUnit.SECONDS.sleep(1);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }

            }
        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        // Set Priority

        thread1.setPriority(10);
        thread2.setPriority(5);


        // Start Thread
        thread1.start();
        thread2.start();




    }
}

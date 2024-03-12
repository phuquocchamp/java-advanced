package concurrency.thread_object;

import java.util.concurrent.TimeUnit;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; ++i){
            System.out.println("Thread 1 count : " + i);
            try{
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }
}

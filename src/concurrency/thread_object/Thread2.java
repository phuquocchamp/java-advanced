package concurrency.thread_object;

import java.util.concurrent.TimeUnit;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; ++i){
            System.out.println("Thread 2 count : " + i);
            try{
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }
}

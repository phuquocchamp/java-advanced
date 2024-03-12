package concurrency.thread_object;

import java.util.concurrent.TimeUnit;

public class Thread3 implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i<= 10; i++){
            System.out.print(" 0 ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

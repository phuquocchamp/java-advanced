package concurrency.thread_object;

import java.util.concurrent.TimeUnit;

public class Thread4 extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<= 10; i++){
            System.out.print(" 1 ");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

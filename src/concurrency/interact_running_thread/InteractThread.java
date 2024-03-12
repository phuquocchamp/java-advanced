package concurrency.interact_running_thread;

public class InteractThread {
    public static void main(String[] args) {

        Thread.currentThread().setPriority(10);

        Thread TA = new Thread(() -> {
            for(int i = 1; i <= 5; ++i){
                System.out.print(" 0 ");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("\nThread A is stopped!");
                    System.out.println("Thread name : " + Thread.currentThread().getName() + " is running!");
                    System.out.println("Thread state : " + Thread.currentThread().getState());
                }
            }
        });

        System.out.println("Thread A state : " + Thread.currentThread().getState());

        TA.setName("A");
        TA.setPriority(2);
        TA.start();
        System.out.println("Thread TA state : " + Thread.currentThread().getState());

    }
}

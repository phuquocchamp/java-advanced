package concurrency.money_management;

public class App {
    public static void main(String[] args) {
        Account A1 = new Account("A1");

        boolean check = true;
        while (check){
            System.out.println("Tài khoản của bạn đang có : " + A1.getMoney());
        }
    }
}

package concurrency.money_management;

public class Money {
    private int money = 1000000;

    public void deposit(int amount){
        if(money >= amount) {
            money -= amount;
        }else{
            throw new RuntimeException();
        }
    }

    public int getMoney(){
        return money;
    }
}

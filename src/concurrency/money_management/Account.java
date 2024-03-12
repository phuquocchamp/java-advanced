package concurrency.money_management;

public class Account {
    private String name;
    private Money money;

    public Account(String name){
        this.name = name;
    }

    public void deposit(int amount){
        if(money.getMoney() >= amount){
            money.deposit(amount);
            System.out.println(this.name +  " đã rút " + amount);
        }else{
            System.out.println("Không đủ tiền để tiếp tục !");
        }
    }

    public int getMoney(){
        return money.getMoney();
    }
}

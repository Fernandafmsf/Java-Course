package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double deposito){
        this.number = number;
        this.holder = holder;
        this.balance =deposito;
    }

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
        this.balance =0;
    }

    public int getNumber(){
        return this.number;
    }

    public String getHolder(){
        return this.holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        this.balance +=amount;
    }

    public void withdraw(double amount){
        this.balance -= (amount + 5);
    }

    public String toString(){
        return "Account "+
                this.number +
                ", Holder: "+
                this.holder +
                ", Balance: $ "+
                String.format("%.2f", this.balance);
    }

}

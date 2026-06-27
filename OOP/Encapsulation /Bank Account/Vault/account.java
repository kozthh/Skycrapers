package Vault;
public class account {

    String name;
    int Id;
    double balance;

    account(String name, int Id) {
        this.name = name;
        this.Id = Id;
        this.balance = 0.0;
    }

    String getName() {
        return name;
    }

    int getId() {
        return Id;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double balance) {
        this.balance += balance;
    }

    void withdraw(double balance) {
        if (this.balance >= balance) {
            this.balance -= balance;
        }  else {throw new IllegalArgumentException("Insufficient balance");}

    }


}
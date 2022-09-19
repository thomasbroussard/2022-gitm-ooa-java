package fr.epita.gitm.datamodel;

public class Account {
    private float balance;


    public Account(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

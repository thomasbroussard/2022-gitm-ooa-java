package fr.epita.gitm.datamodel;

public class SavingsAccount {

    private Account genericAccount;
    private float interestRate;

    public Account getGenericAccount() {
        return genericAccount;
    }

    public void setGenericAccount(Account genericAccount) {
        this.genericAccount = genericAccount;
    }

    public SavingsAccount(float balance, float interestRate) {
        this.genericAccount = new Account(balance);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getBalance() {
        return this.genericAccount.getBalance();
    }

    public void setBalance(float newBalance) {
        this.genericAccount.setBalance(newBalance);
    }

}

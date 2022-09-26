package fr.epita.gitm.services.computations;

public class AccountComputationServices {


    public static float computeInterests(float balance, float interestRate) {
        float totalInterests = balance * interestRate;
        return totalInterests;
    }
}

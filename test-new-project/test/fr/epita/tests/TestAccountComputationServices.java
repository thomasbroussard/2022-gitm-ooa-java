package fr.epita.tests;

import fr.epita.gitm.services.computations.AccountComputationServices;

public class TestAccountComputationServices {


    //
    public static void main(String[] args) {
        //given
        float testBalance = 200.0f;
        float interestRate = 0.03f;

        //when
        float result = AccountComputationServices.computeInterests(testBalance, interestRate);

        //then
        float expectedResult = 6.0f;
        if (expectedResult != result) {
            throw new AssertionError("the expected result " + expectedResult
                    + " does not match the actual : " + result);
        }
        //cleanup

    }

}

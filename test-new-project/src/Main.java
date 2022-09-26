import fr.epita.gitm.datamodel.Customer;
import fr.epita.gitm.datamodel.SavingsAccount;

import fr.epita.gitm.services.computations.AccountComputationServices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello !");

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the name of the customer:");
        String name = scanner.nextLine();
        String address = "Paris";

        Customer thomas = new Customer(name, address);

        thomas.setAddress(address);
        thomas.setName(name);





        SavingsAccount savingsAccount = new SavingsAccount(200.0f, 0.001f);

        float balance = savingsAccount.getBalance();
        float interestRate = savingsAccount.getInterestRate();

        float totalInterests = AccountComputationServices.computeInterests(balance, interestRate);

        System.out.println("this year, you gained:" + totalInterests);


        String name_2 = "quentin";
        String address_2 = "créteil";


    }


}

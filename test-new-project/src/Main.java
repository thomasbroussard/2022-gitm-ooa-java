import fr.epita.gitm.datamodel.Customer;
import fr.epita.gitm.datamodel.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello !");


        String name = "thomas";
        String address = "Paris";

        Customer thomas = new Customer(name, address);

        thomas.setAddress(address);
        thomas.setName(name);


        SavingsAccount savingsAccount = new SavingsAccount(200.0f, 0.001f);

        float balance = savingsAccount.getBalance();
        float interestRate = savingsAccount.getInterestRate();

        float totalInterests = balance * interestRate;

        System.out.println("this year, you gained:" + totalInterests);


        String name_2 = "quentin";
        String address_2 = "créteil";


    }
}

import fr.epita.gitm.datamodel.Customer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello !");


        String name = "thomas";
        String address = "Paris";

        Customer thomas = new Customer(name, address);

        thomas.setAddress(address);
        thomas.setName(name);


        String name_2 = "quentin";
        String address_2 = "créteil";


    }
}

import fr.epita.datamodel.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.csv");
        FileInputStream fis = new FileInputStream(file);

        Scanner scanner = new Scanner(fis);

        System.out.println("welcome to this application");

        List<Person> personList = new ArrayList<>();
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineParts = line.split(";");
            Person person = new Person();
            person.setAddress(lineParts[1]);
            personList.add(person);
        }

        System.out.println(personList);

    }
}
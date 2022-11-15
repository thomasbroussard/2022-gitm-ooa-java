package fr.epita.services;

import fr.epita.datamodel.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    private final File file;

    /*  the csv reader in here reads a csv and creates new Person objects   */
    public CSVReader(File file)throws FileNotFoundException {
        this.file = file;
    }


    public List<Person> readPersons() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);
        scanner.nextLine();/* to skip the first line in the file */

        List<Person> personList = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            readPerson(line); /* calls the fct readPerson to create a new person from line */
            personList.add(readPerson(line));/* not sure if this one would work  */
        }
        return personList;
    }
    private Person readPerson(String record){

        String[] lineParts = record.split(";");/*  */
        Person person = new Person();
        person.setAddress(lineParts[1]);
        person.setPhone(lineParts[2]);
        person.setName(lineParts[0]);
        return person ;
    }


}

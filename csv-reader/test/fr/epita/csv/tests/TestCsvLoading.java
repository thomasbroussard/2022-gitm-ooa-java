package fr.epita.csv.tests;

import fr.epita.datamodel.Person;
import fr.epita.services.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class TestCsvLoading {

    public static void main(String[] args) throws FileNotFoundException {
        CSVReader reader = new CSVReader(new File("test.csv"));
        List<Person> persons = reader.readPersons();
        System.out.println(persons);
    }
}

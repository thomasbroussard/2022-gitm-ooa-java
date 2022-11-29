package fr.epita.tests;

import fr.epita.datamodel.Person;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class TestSER2 {

    public static void test() throws IOException {
        List<String> lines = Files.readAllLines(new File("data.csv").toPath());
        String s = lines.get(2);
        String[] personParts = s.split(",");
        Person person = new Person(
                personParts[0].trim(),
                personParts[1].trim(),
                Integer.parseInt(personParts[2].trim()),
                Integer.parseInt(personParts[3].trim()),
                Integer.parseInt(personParts[4].trim())
        );

    }
}

package fr.epita.tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class TestSER1 {

    public static void test() throws IOException {
        List<String> lines = Files.readAllLines(new File("data.csv").toPath());
        System.out.println(lines.get(2));
    }
}

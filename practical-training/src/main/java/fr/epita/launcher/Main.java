package fr.epita.launcher;

import fr.epita.tests.TestDMO2;
import fr.epita.tests.TestSER1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TestDMO2.test();
        TestSER1.test();

    }
}

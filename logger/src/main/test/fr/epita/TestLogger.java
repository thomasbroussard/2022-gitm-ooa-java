package fr.epita;

import fr.epita.logging.Logger;

import java.io.File;
import java.io.FileNotFoundException;

public class TestLogger {


    public static void main(String[] args) throws FileNotFoundException {
        Logger logger = new Logger(new File("test.log"));
        logger.log(Logger.Levels.TRACE, "test log error output");
        logger.log(Logger.Levels.INFO, "test log output");

    }
}

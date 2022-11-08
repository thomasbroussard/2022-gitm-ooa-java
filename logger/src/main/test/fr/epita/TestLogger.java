package fr.epita;

import fr.epita.logging.Logger;

public class TestLogger {


    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("INFO", "test log output");
    }
}

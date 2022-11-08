package fr.epita.logging;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {


    private PrintStream printStream;

    public enum Levels{
        INFO,
        WARNING,
        DEBUG,
        ERROR,
        TRACE
    }


    public Logger(){
        this.printStream = System.out;
    }

    public Logger(File file) {
        try {
            this.printStream = new PrintStream(new FileOutputStream(file, true));
        } catch (Exception e){
            this.printStream = System.out;
            this.printStream.println("error while trying to initialize the log file, falling back to system out");
        }
    }

    public void log(Levels logLevel, String message){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedDate = dateFormat.format(date);
        this.printStream.println(formattedDate + " [" + logLevel + "] " + message);
    }
}

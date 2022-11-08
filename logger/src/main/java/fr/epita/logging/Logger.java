package fr.epita.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {



    public void log(String logLevel, String message){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate + " [" + logLevel + "] " + message);
    }
}

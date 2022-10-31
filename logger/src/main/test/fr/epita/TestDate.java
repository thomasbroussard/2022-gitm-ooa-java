package fr.epita;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
       // javaUtilDateTest();

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HH:mm:ss.SSS");

        System.out.println(formatter.format(dateTime));
    }



    private static void javaUtilDateTest() {
        Date date = new Date();
        System.out.println(date);

        //year-month-day-hours-minutes-seconds-milliseconds
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSS");
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(formattedDate);
    }
}

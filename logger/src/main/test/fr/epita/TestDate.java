package fr.epita;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
       // javaUtilDateTest();
        //"date to String"
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm:ss.SSS");
        System.out.println(formatter.format(dateTime));


        //"String to date"
        String input = "m014/05/25 - 16:58:10.302";

        try {
            TemporalAccessor parsedDateTime = formatter.parse(input);
            System.out.println(parsedDateTime);
        }catch (DateTimeException e){
            System.out.println("error in the format, please correct the following input :"+ input);
            e.printStackTrace();
        } finally {

        }


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

package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

import static java.util.Locale.US;

public class Main {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        TimeZone timeZone = TimeZone.getTimeZone("US/Central");

        //mm/dd/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = today.format(formatter1);
        System.out.println("today is: " + formattedDate1);

        //yyyy/mm/dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = today.format(formatter2);
        System.out.println("today is: " + formattedDate2);

        //dddd dd,yyyy
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE dd, yyyy");
        String formattedDate3 = today.format(formatter3);
        System.out.println("today is: " + formattedDate3);

        //EEEE, MM dd, yyyy HH:mm
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        String formattedDate4 = today.format(formatter4);
        System.out.println("today is: " + formattedDate4);

        //challenger
        //HH:mm on dd-mon-yyy
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm 'on' dd-MMM-yyyy");
        String formattedDate5 = today.format(formatter5);
        System.out.println("today is: " + formattedDate5);




    }
}

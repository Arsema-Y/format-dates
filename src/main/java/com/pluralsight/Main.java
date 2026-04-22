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

        //mm/dd/yyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = today.format(formatter1);
        System.out.println("today is: " + formattedDate1);



    }
}

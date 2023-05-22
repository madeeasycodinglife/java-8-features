package org.madeeasy.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate expiryDate = LocalDate.of(2022, Month.MARCH, 10);
        LocalDate now = LocalDate.now();
        if (expiryDate.isBefore(now)) {
            System.out.println("The date is in the past!");
        } else {
            System.out.println("The date is in the future.");
        }
        // current date and add one day
        LocalDate date = now.plusDays(1);
        //  current date and subtract one month
        LocalDate date2 = now.minusMonths(1);
        /**
         * we parse the date “2016-06-12” and get the day of the week and the day of the month respectively.
         * Note the return values — the first is an object representing the DayOfWeek, while the second is an
         * int representing the ordinal value of the month
         */
        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
        //----------------------------------------------------------
        int dayOfWeek = date.getDayOfWeek().getValue();
        int dayOfMonth = date.getDayOfMonth();
        int month = date.getMonth().getValue();
        int year = date.getYear();
        long age = now.until(date, ChronoUnit.DAYS);
        //-----------------------------------------------------------
        // to check leap year
        boolean leapYear = now.isLeapYear();
        // to get the month length
        int monthLength = now.lengthOfMonth();
        // to get the month name
        Month monthEnum = date.getMonth();
        // to get the day of the week
        DayOfWeek dayOfWeekEnum = date.getDayOfWeek();
        // add one day
        date = date.plusDays(1);
        System.out.println("date = " + date);
    }
}


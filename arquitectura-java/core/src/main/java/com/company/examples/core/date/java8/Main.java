package com.company.examples.core.date.java8;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());

        LocalDate otherDay = LocalDate.of(2017, 3,7);
        System.out.println(otherDay.isBefore(today));

        // Immutability
        LocalDate future = today.withDayOfMonth(20);
        System.out.println(future);

        System.out.println(today.plusYears(1).plusMonths(2));

        // Period
        Period period = Period.between(today, future);
        System.out.println(period.getDays());
    }

}

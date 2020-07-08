package com.company.examples.core.date.calendar;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Date otherDate = calendar.getTime();
        System.out.println(otherDate);

        calendar.set(Calendar.YEAR, 1990);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        Date birthday = calendar.getTime();
        System.out.println(birthday);

    }

}

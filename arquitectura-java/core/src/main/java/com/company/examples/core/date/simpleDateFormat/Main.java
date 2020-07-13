package com.company.examples.core.date.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        String strDate = "10/12/2016";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date date = simpleDateFormat.parse(strDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            System.out.println(date);

            // SimpleDateFormat to Date
            String strDateOther = simpleDateFormat.format(date);
            System.out.println(strDateOther);

            System.out.println(calendar.get(Calendar.YEAR));
            System.out.println(calendar.get(Calendar.MONTH));
            System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}

package com.company.examples.core.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMain {

    public static void main(String[] args) {

        String invoices = "The invoices are 123AB and 234BC";
        String expression = "\\d{3}[A-Z]{2}";
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(invoices);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(invoices.substring(start, end));
        }
    }

}

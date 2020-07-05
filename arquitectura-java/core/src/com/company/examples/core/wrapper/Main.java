package com.company.examples.core.wrapper;

public class Main {

    public static void main(String[] args) {

        System.out.println("-- int to Integer");
        int number = 7;
        Integer wrapperInteger = new Integer(number);
        System.out.println(number);
        System.out.println(wrapperInteger);

        System.out.println("--  Integer to int");
        Integer wrapperIntegerOther = new Integer(4);
        System.out.println(wrapperIntegerOther.intValue() + 5);

        System.out.println("--  String to Integer");
        String strNumberOne = "14";
        String strNumberTwo = "25";

        System.out.println(strNumberOne + strNumberTwo);
        System.out.println(Integer.parseInt(strNumberOne) + Integer.parseInt(strNumberTwo));

        System.out.println("--  String to double");
        String strN1 = "20.20";
        String strN2 = "40.20";
        double n1 = Double.parseDouble(strN1);
        double n2 = Double.parseDouble(strN2);
        System.out.println(n1 + n2);
    }

}

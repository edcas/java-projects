package com.company.examples.core.regularexpressions;

public class Main {

    public static void main(String[] args) {

        String message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String[] list = message.split("[\\s]");

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        String strCustomers = "Customer A is code1234, Customer B is code3425";
        String secureCustomers = strCustomers.replaceAll("[a-zA-Z]{3,10}\\d{4}", "*******");
        System.out.println(secureCustomers);
    }

}

package com.company.examples.inheritance;

public class Main {

    public static void main(String[] args) {

        Athlete athlete = new Athlete();
        athlete.setName("John");
        athlete.setSport("Tennis");

        System.out.println(athlete.getName());
        System.out.println(athlete.getSport());

    }

}

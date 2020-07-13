package com.company.examples.polymorphism;

public class Main {

    public static void main(String[] args) {

        // Polymorphism
        Person athlete = new Athlete("John", "Tennis");
        Person engineer = new Engineer("Maggie");
        Athlete otherAthlete = new Athlete("Michael", "Soccer");

        initialRun(athlete);
        initialRun(engineer);
        initialRun(otherAthlete);

        // Casting
        Person matthew = new Athlete("Matthew", "Basketball");
        matthew.run();
        // Person -> Athlete
        Athlete athleteMatthew = (Athlete) matthew;
        System.out.println(athleteMatthew.getName() + " likes " + athleteMatthew.getSport());
    }

    /**
     * It hides an entire class hierarchy.
     * The programmer who uses this method does not need to know that the engineer and athlete classes exist.
     */
    public static void initialRun(Person person) {
        person.run();
    }
}

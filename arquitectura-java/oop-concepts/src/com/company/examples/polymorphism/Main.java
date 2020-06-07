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

    }

    /**
     * It hides an entire class hierarchy.
     * The programmer who uses this method does not need to know that the engineer and athlete classes exist.
     */
    public static void initialRun(Person person) {
        person.run();
    }
}

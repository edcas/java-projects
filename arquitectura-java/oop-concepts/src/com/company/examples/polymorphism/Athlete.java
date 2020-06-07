package com.company.examples.polymorphism;

public class Athlete extends Person {

    private String sport;

    public Athlete(String name, String sport) {
        super(name);
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " runs at 10 kph");
    }
}

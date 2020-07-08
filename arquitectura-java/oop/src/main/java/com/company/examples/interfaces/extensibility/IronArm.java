package com.company.examples.interfaces.extensibility;

public class IronArm implements Rotatable {

    @Override
    public void rotate() {
        System.out.println("The iron arm rotate at 90 turns / minutes.");
    }

}

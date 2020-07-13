package com.company.examples.interfaces.extensibility;

public class ArmSuper implements Turnable, Rotatable {
    @Override
    public void rotate() {
        System.out.println("The super arm rotate at 150 turns / minutes.");
    }

    @Override
    public void turn() {
        System.out.println("The super arm turn at 150 turns / minutes.");
    }
}

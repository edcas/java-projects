package com.company.examples.interfaces.extensibility;

public class FastArm extends Arm implements Turnable {

    public void turn() {
        System.out.println("The arm turn at 50 turns / minutes.");
    }

}

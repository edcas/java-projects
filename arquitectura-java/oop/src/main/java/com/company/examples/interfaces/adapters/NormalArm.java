package com.company.examples.interfaces.adapters;

public class NormalArm extends Arm implements Turnable {

    public void turn() {
        System.out.println("The arm turn at 20 turns / minutes.");
    }

}

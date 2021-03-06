package com.company.examples.interfaces.extensibility;

public class Robot {

    private Turnable arm;

    public Turnable getArm() {
        return arm;
    }

    public void setArm(Turnable arm) {
        this.arm = arm;
    }

    public void turnArm() {
        this.arm.turn();
    }
}

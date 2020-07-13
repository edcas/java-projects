package com.company.examples.interfaces.problem;

public class Robot {

    private Arm arm;

    public Arm getArm() {
        return arm;
    }

    public void setArm(Arm arm) {
        this.arm = arm;
    }

    public void turnArm() {
        this.arm.turn();
    }
}

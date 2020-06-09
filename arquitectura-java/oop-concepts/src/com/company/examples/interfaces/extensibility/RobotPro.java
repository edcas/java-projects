package com.company.examples.interfaces.extensibility;

public class RobotPro extends Robot {

    private Rotatable armPro;

    public Rotatable getArmPro() {
        return armPro;
    }

    public void setArmPro(Rotatable armPro) {
        this.armPro = armPro;
    }

    public void rotateArmPro() {
        this.armPro.rotate();
    }
}

package com.company.examples.interfaces.extensibility;

public class IronArmAdapter implements Turnable {

    private Rotatable rotatable;

    public IronArmAdapter(Rotatable rotatable) {
        this.rotatable = rotatable;
    }

    public Rotatable getIronArm() {
        return rotatable;
    }

    public void setIronArm(Rotatable rotatable) {
        this.rotatable = rotatable;
    }

    @Override
    public void turn() {
        // Adapter method
        this.rotatable.rotate();
    }
}

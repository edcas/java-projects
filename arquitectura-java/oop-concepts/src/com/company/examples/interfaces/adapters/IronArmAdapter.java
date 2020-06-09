package com.company.examples.interfaces.adapters;

public class IronArmAdapter implements Turnable {

    private IronArm ironArm;

    public IronArmAdapter(IronArm ironArm) {
        this.ironArm = ironArm;
    }

    public IronArm getIronArm() {
        return ironArm;
    }

    public void setIronArm(IronArm ironArm) {
        this.ironArm = ironArm;
    }

    @Override
    public void turn() {
        // Adapter method
        this.ironArm.rotate();
    }
}

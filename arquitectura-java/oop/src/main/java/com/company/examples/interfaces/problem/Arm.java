package com.company.examples.interfaces.problem;

public abstract class Arm {

    private String blade;

    public abstract void turn();

    public String getBlade() {
        return blade;
    }

    public void setBlade(String blade) {
        this.blade = blade;
    }
    
}

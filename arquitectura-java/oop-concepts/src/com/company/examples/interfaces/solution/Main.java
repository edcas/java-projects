package com.company.examples.interfaces.solution;

public class Main {

    public static void main(String[] args) {

        Turnable normal = new NormalArm();
        Turnable fast = new FastArm();
        Turnable cocktail = new Cocktail();

        Robot robot = new Robot();
        robot.setArm(normal);
        robot.turnArm();

        robot.setArm(fast);
        robot.turnArm();

        robot.setArm(cocktail);
        robot.turnArm();

        NormalArm normalArm = (NormalArm) normal;
        System.out.println(normalArm.getBlade());

    }

}

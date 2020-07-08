package com.company.examples.interfaces.problem;

public class Main {

    public static void main(String[] args) {

        Arm normal = new NormalArm();
        Arm fast = new FastArm();
        Arm cocktail = new Cocktail();

        Robot robot = new Robot();
        robot.setArm(normal);
        robot.turnArm();

        robot.setArm(fast);
        robot.turnArm();

        // Business error
        robot.setArm(cocktail);
        robot.turnArm();
        System.out.println(cocktail.getBlade());

    }

}

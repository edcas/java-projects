package com.company.examples.interfaces.extensibility;

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

        Rotatable rotatable = new IronArm();
        robot.setArm(new IronArmAdapter(rotatable));
        robot.turnArm();

        // Extensibility
        Turnable standar = new NormalArm();
        Rotatable iron = new IronArm();
        RobotPro robotPro = new RobotPro();
        robotPro.setArm(standar);
        robotPro.turnArm();

        robotPro.setArmPro(iron);
        robotPro.rotateArmPro();

        //
        robotPro.setArm(new ArmSuper());
        robotPro.turnArm();
        robotPro.setArmPro(new ArmSuper());
        robotPro.rotateArmPro();

    }

}

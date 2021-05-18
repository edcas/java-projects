package tech.eduardnow.creational.singleton.threadsafe;

import tech.eduardnow.creational.singleton.staticDemo.DBSingleton;

public class DBSingletonDemo {

    public static void main(String[] args) {

        DBSingleton instance = DBSingleton.getInstance();
        DBSingleton otherInstance = DBSingleton.getInstance();

        System.out.println(instance);
        System.out.println(otherInstance);
    }

}

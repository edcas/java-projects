package tech.eduardnow.creational.singleton.staticDemo;

public class DBSingletonDemo {

    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();

        System.out.println(instance);

        DBSingleton otherInstance = DBSingleton.getInstance();
        System.out.println(otherInstance);
    }

}

package tech.eduardnow.creational.singleton.staticDemo;

public class DBSingleton {

    private static final DBSingleton instance = new DBSingleton();

    private DBSingleton() {
    }

    public static DBSingleton getInstance() {
        return instance;
    }

}

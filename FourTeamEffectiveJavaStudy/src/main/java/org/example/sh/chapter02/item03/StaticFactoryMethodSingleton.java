package org.example.sh.chapter02.item03;

public class StaticFactoryMethodSingleton {
    private static final StaticFactoryMethodSingleton instance = new StaticFactoryMethodSingleton();
    private StaticFactoryMethodSingleton() {}

    public static StaticFactoryMethodSingleton getInstance() {
        return instance;
    }

    public String getHello() {
        return "Hello StaticFactoryMethodSingleton!";
    }
}

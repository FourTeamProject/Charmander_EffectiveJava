package org.example.sh.chapter02.item03;

public class FinalFieldSingleton {
    public static final FinalFieldSingleton INSTANCE = new FinalFieldSingleton();
    private FinalFieldSingleton() {}

    public String getHello() {
        return "Hello FinalFieldSingleton!";
    }
}

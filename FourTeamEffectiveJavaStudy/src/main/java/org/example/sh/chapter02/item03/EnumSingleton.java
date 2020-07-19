package org.example.sh.chapter02.item03;

public enum EnumSingleton {
    INSTANCE;

    public String getHello() {
        return "Hello EnumSingleton!";
    }
}

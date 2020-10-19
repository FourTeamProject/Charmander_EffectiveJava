package org.example.sh.chapter02.item03;

public class LazyHolderSingleton {
    private LazyHolderSingleton() {}

    public static LazyHolderSingleton getInstance() {
        return LazyHolder.instance;
    }

    private static class LazyHolder {
        private static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    public String getHello() {
        return "Hello LazyHolderSingleton!";
    }

    @Override
    public String toString() {
        return "LazyHolderSingleton{}";
    }
}

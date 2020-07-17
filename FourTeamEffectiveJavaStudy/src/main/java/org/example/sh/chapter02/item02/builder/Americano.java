package org.example.sh.chapter02.item02.builder;

public class Americano extends Coffee {

    public static class Builder extends Coffee.Builder<Builder> {
        @Override
        Coffee build() {
            return new Americano(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Americano(Coffee.Builder builder) {
        super(builder);
    }
}

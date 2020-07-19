package org.example.sh.chapter02.item02;

public class Americano extends Coffee {
    private Coffee.Size size;
    private Coffee.Type type;
    public static class Builder extends Coffee.Builder<Builder> {
        private Coffee.Size size;
        private Coffee.Type type;

        public Builder(Size size, Type type) {
            this.size = size;
            this.type = type;
        }

        @Override
        boolean canAddedTopping(Topping topping) {
            return topping.equals(Topping.SHOT);
        }
        @Override
        public Coffee build() {
            return new Americano(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Americano(Builder builder) {
        super(builder);
        this.size = builder.size;
        this.type = builder.type;
    }

    @Override
    public String toString() {
        return "Americano{" +
                "size=" + size +
                ", type=" + type +
                ", toppings=" + toppings +
                '}';
    }
}

package org.example.sh.chapter02.item02;

import org.example.effectivejava.chapter2.item2.hierarchicalbuilder.NyPizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Coffee {
    public enum Topping {SHOT, MILK, VANILLA_SYRUP}
    public enum Size {TALL, GRANDE, VENTI}
    public enum Type {ICE, HOT}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Coffee.Topping> toppings = EnumSet.noneOf(Coffee.Topping.class);
        public T addTopping(Coffee.Topping topping) {
            if (!canAddedTopping(topping)) {
                throw new IllegalArgumentException("Can not add \"" + topping + "\" topping.");
            }
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract boolean canAddedTopping(Coffee.Topping topping);
        abstract Coffee build();
        protected abstract T self();
    }

    Coffee(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}

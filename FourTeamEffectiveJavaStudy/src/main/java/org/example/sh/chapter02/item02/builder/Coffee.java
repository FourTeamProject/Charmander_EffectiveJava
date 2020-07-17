package org.example.sh.chapter02.item02.builder;

import org.example.effectivejava.chapter2.item2.hierarchicalbuilder.Pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Coffee {
    private enum Topping {SHOT, MILK, VANILLA_SYRUP}
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Coffee.Topping> toppings = EnumSet.noneOf(Coffee.Topping.class);
        public T addTopping(Coffee.Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Coffee build();
        protected abstract T self();
    }

    Coffee(Coffee.Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}

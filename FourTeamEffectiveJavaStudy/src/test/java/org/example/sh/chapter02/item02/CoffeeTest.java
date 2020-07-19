package org.example.sh.chapter02.item02;

import org.junit.Test;

public class CoffeeTest {

    @Test
    public void americanoTest() {
        // given
        Coffee americano = new Americano.Builder(Coffee.Size.GRANDE, Coffee.Type.ICE)
                .addTopping(Coffee.Topping.SHOT).build();

        // when


        // then
        System.out.println(americano);
    }
    @Test
    public void latteTest() {
        // given
        Coffee latte = new Latte.Builder(Coffee.Size.TALL, Coffee.Type.HOT)
                .addTopping(Coffee.Topping.SHOT)
                .addTopping(Coffee.Topping.MILK).build();

        // when


        // then
        System.out.println(latte);
    }
    @Test
    public void vanillaLatteTest() {
        // given
        Coffee vanillaLatte = new VanillaLatte.Builder(Coffee.Size.VENTI, Coffee.Type.ICE)
                .addTopping(Coffee.Topping.VANILLA_SYRUP).build();

        // when


        // then
        System.out.println(vanillaLatte);
    }
}
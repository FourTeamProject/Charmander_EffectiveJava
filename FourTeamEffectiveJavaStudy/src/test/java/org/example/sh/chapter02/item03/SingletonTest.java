package org.example.sh.chapter02.item03;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class SingletonTest {
    @Test
    public void finalFieldSingletonTest() {
        // given
        FinalFieldSingleton singleton = FinalFieldSingleton.INSTANCE;
        FinalFieldSingleton anotherInstance = FinalFieldSingleton.INSTANCE;
        String expected = "Hello FinalFieldSingleton!";

        // when
        String greeting = singleton.getHello();

        // then
        assertThat(singleton, is(sameInstance(anotherInstance)));
        assertThat(greeting, is(equalTo(expected)));
        assertThat(greeting, is(equalTo(anotherInstance.getHello())));
    }

    @Test
    public void staticFactoryMethodSingletonTest() {
        // given
        StaticFactoryMethodSingleton singleton = StaticFactoryMethodSingleton.getInstance();
        StaticFactoryMethodSingleton anotherInstance = StaticFactoryMethodSingleton.getInstance();
        String expected = "Hello StaticFactoryMethodSingleton!";

        // when
        String greeting = singleton.getHello();

        // then
        assertThat(singleton, is(sameInstance(anotherInstance)));
        assertThat(greeting, is(equalTo(expected)));
        assertThat(greeting, is(equalTo(anotherInstance.getHello())));
    }

    @Test
    public void enumSingletonTest() {
        // given
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton anotherInstance = EnumSingleton.INSTANCE;
        String expected = "Hello EnumSingleton!";

        // when
        String greeting = singleton.getHello();

        // then
        assertThat(singleton, is(sameInstance(anotherInstance)));
        assertThat(greeting, is(equalTo(expected)));
        assertThat(greeting, is(equalTo(anotherInstance.getHello())));
    }
}

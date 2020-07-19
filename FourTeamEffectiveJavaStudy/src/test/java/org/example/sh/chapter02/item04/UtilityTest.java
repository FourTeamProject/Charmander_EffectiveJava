package org.example.sh.chapter02.item04;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class UtilityTest {
    @Test
    public void abstractUtilsTest () {
        // given
        String expected = "Hello AbstractUtils!";

        // when
        String greeting = AbstractUtils.getHello();

        // then
        assertThat(greeting, is(equalTo(expected)));
    }

    @Test
    public void privateConstructorUtilsTest () {
        // given
        String expected = "Hello PrivateConstructorUtils!";

        // when
        String greeting = PrivateConstructorUtils.getHello();

        // then
        assertThat(greeting, is(equalTo(expected)));
    }
}

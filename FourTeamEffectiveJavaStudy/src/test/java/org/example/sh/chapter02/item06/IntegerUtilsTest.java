package org.example.sh.chapter02.item06;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerUtilsTest {

    @Test
    public void sumAllInteger() {
        long startTime = System.nanoTime();
        IntegerUtils.sumAllInteger();
        long endTime = System.nanoTime();
        System.out.println( (endTime - startTime) / 1_000_000. + " ms.");
    }

}
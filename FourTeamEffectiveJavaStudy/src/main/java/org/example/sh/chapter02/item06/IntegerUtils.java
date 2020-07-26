package org.example.sh.chapter02.item06;

public abstract class IntegerUtils {

    public static long sumAllInteger() {
        long sumValue = 0L; // Long -> long으로 변경하면 속도가 개선된다.
        for (long i = 0L; i < Integer.MAX_VALUE; i++) { // long i => int i로 변경하면 왜 속도가 줄어들지?
            sumValue += i;
        }
        return sumValue;
    }
}

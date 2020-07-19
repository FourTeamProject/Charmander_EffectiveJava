package org.example.sh.chapter02.item04;

public class Test extends AbstractUtils {
    public final AbstractUtils INSTANCE = new AbstractUtils() {
        @Override
        public String toString() {
            return super.toString();
        }
    };
}

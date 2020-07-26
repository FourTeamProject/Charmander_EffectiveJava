package org.example.jw.item07;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:34 오후
 */
public class SampleResource implements AutoCloseable{

    private boolean closed;

    @Override
    public void close() throws RuntimeException {
        if (this.closed) {
            throw new IllegalStateException();

        }
        System.out.println("close");
    }

    public void hello() {
        System.out.println("hello");
    }

    @Override
    protected void finalize() throws Throwable {
        if (!this.closed)
            close();
    }
}

package org.example.jw.item07;

import java.lang.ref.Cleaner;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:34 오후
 */
public class SampleResource2 implements AutoCloseable{

    private static final Cleaner CLEANER = Cleaner.create();

    private final Cleaner.Cleanable cleanable;

    private final ResourceCleaner resourceCleaner;

    public SampleResource2() {
        this.resourceCleaner = new ResourceCleaner();
        this.cleanable  = CLEANER.register(this, resourceCleaner);
    }

    private static class ResourceCleaner implements Runnable  {

        @Override
        public void run() {
            System.out.println("Clean");
        }
    }

    private boolean closed;

    @Override
    public void close() throws RuntimeException {
        if (this.closed) {
            throw new IllegalStateException();

        }

        closed = true;
        cleanable.clean();

        System.out.println("close");
    }

    public void hello() {
        System.out.println("hello");
    }

//    @Override
//    protected void finalize() throws Throwable {
//        if (!this.closed)
//            close();
//    }
}

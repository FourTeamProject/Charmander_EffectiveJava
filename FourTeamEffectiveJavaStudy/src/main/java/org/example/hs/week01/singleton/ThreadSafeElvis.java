package org.example.hs.week01.singleton;

public class ThreadSafeElvis {
    private static ThreadSafeElvis INSTANCE;
    private ThreadSafeElvis() throws Exception {
        if(true) {
            throw new Exception();
        }
    }

    public static ThreadSafeElvis getInstance() throws Exception {
        if(INSTANCE == null) {
            synchronized (ThreadSafeElvis.class) {
                if(INSTANCE == null) {
                    INSTANCE = new ThreadSafeElvis();
                }
            }
        }
        return INSTANCE;
    }

    // readResolve 메서드를 정의한다.
    private Object readResolve() {
        // 싱글턴을 보장하기 위함!
        return INSTANCE;
    }
}

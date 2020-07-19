package org.example.hs.week01.singleton;

public class HolderElvis {
    private HolderElvis() throws Exception {
        if(true) {
            throw new Exception();
        }
    }

    private static class LazyHolder {
        public static HolderElvis INSTANCE;

        static {
            try {
                INSTANCE = new HolderElvis();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static HolderElvis getInstance() {
        return LazyHolder.INSTANCE;
    }
}

package org.example.hs.week03;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithRes {
    public static String firstLineOfFile() throws Exception {
        try(Open o = new Open()) {
            throw new IllegalArgumentException();
        }
    }

    public static void sup() {
        try {
            firstLineOfFile();
        } catch (Throwable e) {
            Throwable[] suppExe = e.getSuppressed();

            for (int i = 0; i < suppExe.length; i++) {
                System.out.println("Suppressed Exceptions:");
                System.out.println(suppExe[i]);
            }
        }
    }

    static boolean firstLine(String defaultVal) {
        try (Open o = new Open()) {

            Integer i = null;
            return i == 3;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(defaultVal);
            return false;
        }
    }

    static boolean firstLine2(String defaultVal) throws Exception {
        try (Open o = new Open()) {
            try {
                Integer i = null;
                return i == 3;
            } catch(Exception e) {
                e.printStackTrace();
                System.out.println(defaultVal);
                return false;
            }

        }
    }

    public static void main(String[] args) throws Exception {
        firstLine2("Toppy McTopFace");
        Object o = new Object();
        System.out.println(o);
        System.out.println();
        //firstLine("Toppy McTopFace");
        //sup();
        //System.out.println(firstLineOfFile());
    }
}

class Close implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("print close");
    }
}

class Open implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("print close");
        //throw new NullPointerException();

    }
}
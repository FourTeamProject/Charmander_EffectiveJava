package org.example.hs.week03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryFinally {
    static String firstLineOfFile(String path) throws IOException {
        try {
            throw new IllegalArgumentException();
        } finally {
            throw new NullPointerException();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile(""));
    }
}

package org.example.jw.item05.usecase01;

import java.util.List;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:04 오후
 */
public class SpellChecker {
    private static final Lexicon dictionary = new KoreanDictionary();

    private SpellChecker() {}

    public static boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String type) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        SpellChecker.isValid("hello");
    }
}


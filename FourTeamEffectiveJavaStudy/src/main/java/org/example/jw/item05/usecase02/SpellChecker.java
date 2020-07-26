package org.example.jw.item05.usecase02;

import java.util.List;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:04 오후
 */
public class SpellChecker {
    // TODO: [Dictionary가 고정되어있어 유연하지 않다.] junwoochoi 2020/07/26 3:13 오후
    private static final Lexicon dictionary = new KoreanDictionary();

    private SpellChecker() {}

    // TODO: [싱글턴 추가] junwoochoi 2020/07/26 3:11 오후
    public static final SpellChecker INSTANCE = new SpellChecker();

    public boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public List<String> suggestions(String type) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        SpellChecker.INSTANCE.isValid("eatting");
        //SpellChecker.isValid("hello");
    }
}


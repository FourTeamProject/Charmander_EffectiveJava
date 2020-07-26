package org.example.jw.item05.usecase03;

import java.util.List;
import java.util.function.Supplier;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:04 오후
 */
public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public List<String> suggestions(String type) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker(new EnglishDictionary());

        spellChecker.isValid("junwoo");
    }
}


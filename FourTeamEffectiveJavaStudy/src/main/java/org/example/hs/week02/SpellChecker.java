package org.example.hs.week02;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {
    private Lexicon dictionary;

    //의존 객체 주입 패턴 활용
    public SpellChecker(String dic) {
        Factory factory = new LexiconFactory();
        this.dictionary = factory.create(dic);
        this.dictionary.print();
    }

    public SpellChecker(Supplier<? extends Lexicon> lexiconFac) {
        this.dictionary = lexiconFac.get();
        this.dictionary.print();
    }

    public boolean isValid(String word){
        return false;
    }
    public List<String> suggestions(String typo) {
        return null;
    }
}

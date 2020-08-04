package org.example.hs.week02;

public class LexiconFactory extends Factory{
    @Override
    protected Lexicon createProduct(String dic) {
        if(dic.equals("1")) {
            return new Dictionary1();
        } else {
            return new Dictionary2();
        }
    }
}

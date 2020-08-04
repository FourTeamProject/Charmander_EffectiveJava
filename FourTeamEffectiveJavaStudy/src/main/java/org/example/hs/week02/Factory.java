package org.example.hs.week02;

abstract class Factory {
    public final Lexicon create(String dic) {
        return createProduct(dic);
    }
    protected abstract Lexicon createProduct(String dic);
}

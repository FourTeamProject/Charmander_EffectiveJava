package org.example.sh.chapter02.item01.impl;

import org.example.sh.chapter02.item01.SmartPhone;

public class SansungPhone implements SmartPhone {
    @Override
    public String turnOn() {
        return "Turn on SansungPhone";
    }

    @Override
    public String turnOff() {
        return "Turn off SansungPhone";
    }
}

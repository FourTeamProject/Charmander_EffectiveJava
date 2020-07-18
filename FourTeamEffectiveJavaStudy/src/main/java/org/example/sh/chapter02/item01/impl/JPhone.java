package org.example.sh.chapter02.item01.impl;

import org.example.sh.chapter02.item01.SmartPhone;

public class JPhone implements SmartPhone {
    @Override
    public String turnOn() {
        return "Turn on JPhone";
    }

    @Override
    public String turnOff() {
        return "Turn off JPhone";
    }
}

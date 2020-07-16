package org.example.sh.chapter02.item01.impl;

import org.example.sh.chapter02.item01.SmartPhone;

public class JPhone implements SmartPhone {
    @Override
    public void turnOn() {
        System.out.println("Turn on JPhone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off JPhone");
    }
}

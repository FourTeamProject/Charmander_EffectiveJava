package org.example.sh.chapter02.item01.impl;

import org.example.sh.chapter02.item01.SmartPhone;

public class SansungPhone implements SmartPhone {
    @Override
    public void turnOn() {
        System.out.println("Turn on SansungPhone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off SansungPhone");
    }
}

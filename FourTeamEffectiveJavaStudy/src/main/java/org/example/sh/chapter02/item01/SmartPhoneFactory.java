package org.example.sh.chapter02.item01;

import org.example.sh.chapter02.item01.impl.JPhone;
import org.example.sh.chapter02.item01.impl.SansungPhone;

public class SmartPhoneFactory {
    private SmartPhoneFactory(){}

    public static SmartPhone createSmartPhone() {
        return Math.random() >= 0.5 ? new JPhone() : new SansungPhone();
    }
    public static SmartPhone createSmartPhone(boolean wantJhone) {
        return wantJhone ? new JPhone() : new SansungPhone();
    }
}

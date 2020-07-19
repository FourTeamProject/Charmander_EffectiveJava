package org.example.sh.chapter02.item01;

import org.example.sh.chapter02.item01.impl.JPhone;
import org.example.sh.chapter02.item01.impl.SansungPhone;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class SmartPhoneTest {
    /**
     * Name: createSmartPhone
     * Date: 2020/07/18
     * Info:
     *  장점3. Sub class를 자유롭게 반환값으로 사용할 수 있다.
     */
    @Test
    public void createSmartPhone() {
        // given
        SmartPhone smartPhone = SmartPhoneFactory.createSmartPhone();
        String expectedTurnOnSansungPhoneMessage = "Turn on SansungPhone";
        String expectedTurnOnJPhoneMessage = "Turn on JPhone";
        String expectedTurnOffSansungPhoneMessage = "Turn off SansungPhone";
        String expectedTurnOffJPhoneMessage = "Turn off JPhone";

        // when
        String turnOnMessage = smartPhone.turnOn();
        String turnOffMessage = smartPhone.turnOff();

        // then
        assertThat(smartPhone, is(instanceOf(SmartPhone.class)));
        assertThat(turnOnMessage, is(anyOf(
                equalTo(expectedTurnOnSansungPhoneMessage)
                , equalTo(expectedTurnOnJPhoneMessage))));
        assertThat(turnOffMessage, is(anyOf(
                equalTo(expectedTurnOffSansungPhoneMessage)
                , equalTo(expectedTurnOffJPhoneMessage))));
    }

    /**
     * Name: createSmartPhone_version2
     * Date: 2020/07/18
     * Info:
     *  장점4. Parameter에 따라 다른 반환값을 사용할 수 있다.
     */
    @Test
    public void createSmartPhone_version2() {
        // given
        SmartPhone jPhone = SmartPhoneFactory.createSmartPhone(true);
        SmartPhone sansungPhone = SmartPhoneFactory.createSmartPhone(false);
        String expectedTurnOnSansungPhoneMessage = "Turn on SansungPhone";
        String expectedTurnOnJPhoneMessage = "Turn on JPhone";
        String expectedTurnOffSansungPhoneMessage = "Turn off SansungPhone";
        String expectedTurnOffJPhoneMessage = "Turn off JPhone";

        jPhone.turnOn();
        jPhone.turnOff();
        sansungPhone.turnOn();
        sansungPhone.turnOff();

        // when
        String turnOnJPhoneMessage = jPhone.turnOn();
        String turnOffJPhoneMessage = jPhone.turnOff();
        String turnOnSansungPhoneMessage = sansungPhone.turnOn();
        String turnOffSansungPhoneMessage = sansungPhone.turnOff();

        // then
        assertThat(jPhone, is(instanceOf(JPhone.class)));
        assertThat(sansungPhone, is(instanceOf(SansungPhone.class)));
        assertThat(turnOnJPhoneMessage, is(equalTo(expectedTurnOnJPhoneMessage)));
        assertThat(turnOffJPhoneMessage, is(equalTo(expectedTurnOffJPhoneMessage)));
        assertThat(turnOnSansungPhoneMessage, is(equalTo(expectedTurnOnSansungPhoneMessage)));
        assertThat(turnOffSansungPhoneMessage, is(equalTo(expectedTurnOffSansungPhoneMessage)));
    }

}
package org.example.sh.chapter02.item01;

public class AppRunner {
    public static void main(String[] args) {
        // 장점1. 명확한 이름을 갖는 메서드를 통해 생성자를 대신할 수 있다.
        Book bookSetName = Book.createBookSetName("BookName");
        Book bookSetAuthor = Book.createBookSetAuthor("BookAuthor");
        System.out.println(bookSetName);
        System.out.println(bookSetAuthor);
        System.out.println();

        // 장점2. 매번 새로운 객체를 생성할 필요가 없다.
        Book defaultBook1 = Book.createDefaultBook();
        Book defaultBook2 = Book.createDefaultBook();
        System.out.println(defaultBook1.equals(defaultBook2));
        System.out.println(defaultBook1 == defaultBook2);
        System.out.println();

        // 장점3. Sub class를 자유롭게 반환값으로 사용할 수 있다.
        SmartPhone smartPhone = SmartPhoneFactory.createSmartPhone();
        smartPhone.turnOn();
        smartPhone.turnOff();
        System.out.println();

        // 장점4. Parameter에 따라 다른 반환값을 사용할 수 있다.
        SmartPhone jPhone = SmartPhoneFactory.createSmartPhone(true);
        SmartPhone sansungPhone = SmartPhoneFactory.createSmartPhone(false);
        jPhone.turnOn();
        jPhone.turnOff();
        sansungPhone.turnOn();
        sansungPhone.turnOff();
        System.out.println();

        // 장점5. 작성시점에는 반환할 클래스가 존재하지 않아도 된다. (생략)
    }
}

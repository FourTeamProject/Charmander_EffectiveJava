package org.example.jw.item01;

import java.util.Collections;
import java.util.EnumSet;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 10:35 오후
 */
public class Foo {

    String name;

    private static final Foo GOOD_NIGHT = new Foo();

    public Foo(String name) {
        this.name = name;
    }

    public Foo() {

    }

    public static Foo withName(String name) {
        return new Foo(name);
    }

    public static Foo withAddress(String address) {
        return new Foo(address);
    }

    public static Foo getFoo() {
        return GOOD_NIGHT;
    }

    public static Foo getChildFoo() {
        return new ChildFoo();
    }

    public static void main(String[] args) {
        Foo foo = new Foo("junwoo");
        Foo.withName("junwoo");

        /*시그니처를 새로 만들 필요가 없다.*/
        Foo.withAddress("SongPa");

        Foo foo1 = Foo.getFoo();
        Foo foo2 = Foo.getFoo();
        System.out.println(foo1);
        System.out.println(foo2);


        Foo childFoo = Foo.getChildFoo();

        EnumSet<Color> colors = EnumSet.allOf(Color.class);
        /*JumboEnumSet, RegularEnumSet*/
        EnumSet<Color> red = EnumSet.of(Color.RED, Color.WHITE);


//        private BeanUtils() {
//            throw new AssertionError();
//        }

    }
}

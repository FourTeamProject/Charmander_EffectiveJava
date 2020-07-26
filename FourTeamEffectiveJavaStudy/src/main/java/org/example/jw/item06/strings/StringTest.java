package org.example.jw.item06.strings;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 3:57 오후
 */
public class StringTest {
    public static void main(String[] args) {
        String name1 = new String("junwoo");
        String name2 = new String("junwoo");

        System.out.println(name1 == name2);

        String name3 = "junwoo";
        String name4 = "junwoo";

        System.out.println(name3 == name4);


        Boolean true1 = Boolean.valueOf("true");
        Boolean true2 = Boolean.valueOf("true");

        System.out.println(true1 = true2);
        System.out.println(true1 == Boolean.TRUE);
    }
}

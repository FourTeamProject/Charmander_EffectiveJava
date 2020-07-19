package org.example.hs.week01.singleton;

import java.util.Arrays;

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    // 이 메서드는 보통 클래스 바깥(다른 클래스)에 작성해야 한다!
    public static void main(String[] args) {
        //Elvis elvis = Elvis.INSTANCE;
        //elvis.leaveTheBuilding();

        Elvis elvis1 = Elvis.INSTANCE;
        Elvis elvis2 = Elvis.INSTANCE;
        System.out.println(elvis1 == elvis2);

        Class<Elvis> elvisClass = Elvis.class;
        Arrays.stream(elvisClass.getDeclaredConstructors()).forEach(f -> {
            try {
                //모든 접근제한자 접근
                f.setAccessible(true);

                Elvis reflectionElvis = (Elvis) f.newInstance();
                System.out.println(elvis1 == reflectionElvis);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

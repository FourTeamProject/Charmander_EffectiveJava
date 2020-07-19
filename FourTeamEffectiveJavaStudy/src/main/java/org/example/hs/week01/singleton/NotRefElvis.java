package org.example.hs.week01.singleton;

import java.rmi.server.ExportException;
import java.util.Arrays;

public class NotRefElvis {
    private static NotRefElvis INSTANCE;
    private NotRefElvis() throws Exception {
        if(true) {
            throw new Exception();
        }
    }
    public static NotRefElvis getInstance() {
        if(INSTANCE == null) {
            try {
                System.out.println("첫번재 생성자 생성");
                INSTANCE = new NotRefElvis();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //Elvis elvis = Elvis.INSTANCE;
        //elvis.leaveTheBuilding();

        NotRefElvis notRefElvis1 = NotRefElvis.getInstance();
        NotRefElvis notRefElvis2 = NotRefElvis.getInstance();
        System.out.println("1" + (notRefElvis1 == notRefElvis2));


        Class<NotRefElvis> elvisClass = NotRefElvis.class;
        Arrays.stream(elvisClass.getDeclaredConstructors()).forEach(f -> {
            try {
                //모든 접근제한자 접근
                f.setAccessible(true);

                NotRefElvis reflectionElvis = (NotRefElvis) f.newInstance();
                System.out.println(notRefElvis1 == reflectionElvis);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

package org.example.jw.item07;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:56 오후
 */
public class FinalizerExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Clean Up");
    }

    public void hello() {
        System.out.println("hola~");
    }
}

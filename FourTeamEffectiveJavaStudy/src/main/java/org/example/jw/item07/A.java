package org.example.jw.item07;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:26 오후
 */
public class A {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
class B extends A{
    @Override
    protected void finalize() throws Throwable {
        /*
        * Class A에 대한 정보를 외부에 노출시킬 수 있고
        * OOM을 일으킬 수 도 있다.
        * */
        super.finalize();
    }
}
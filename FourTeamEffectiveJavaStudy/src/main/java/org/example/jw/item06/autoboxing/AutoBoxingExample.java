package org.example.jw.item06.autoboxing;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 8:25 오후
 */
public class AutoBoxingExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum = 0l;

        for (long i = 0 ; i <= Integer.MAX_VALUE ; i++ ) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start);
    }
}
/*
* 이번 아이템으로 인해 객체를 만드는 것은 비싸며 가급적이면 피해야한다는 오해를 해서는 안된다.
* 특히 방어적인 복사를 해야하는 경우에도 객체를 재사용하면 심각한 버그와 보안성의 문제가 따른다. 객체를 생성하면 그저 스타일과 성능에 영향을 줄 뿐인데...
* */

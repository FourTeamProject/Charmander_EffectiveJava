package org.example.jw.item07;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:00 오후
 */
public class SampleRunner {
    public static void main(String[] args) throws InterruptedException {
        SampleRunner sampleRunner = new SampleRunner();
        sampleRunner.run();
        Thread.sleep(1000l);
    }

    private void run() {
        FinalizerExample finalizerExample = new FinalizerExample();
        finalizerExample.hello();
    }
}

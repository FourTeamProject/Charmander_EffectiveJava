package org.example.jw.item07;

import javax.xml.parsers.SAXParser;

/**
 * Project : FourTeamEffectiveJavaStudy
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 9:35 오후
 */
public class SampleRunner2 {
    public static void main(String[] args) throws Exception {

        SampleResource sampleResource = null;

        try {
            sampleResource = new SampleResource();
            sampleResource.hello();
        } finally {
            if (sampleResource != null) {
                sampleResource.close();
            }
        }

        try(var sampleResource1 = new SampleResource()) {
            sampleResource1.hello();
        }
    }
}

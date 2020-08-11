package org.example.sh.chapter03.item14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        Member bbubbush = new Member(1L, "bbubbush", 31L);
        Member imesung = new Member(2L, "imesung", 30L);
        Member junu = new Member(3L, "junu", 30L);
        Member ssinsa = new Member(4L, "ssinsa", 28L);
        List<Member> list = new ArrayList<>();
        list.add(imesung);
        list.add(ssinsa);
        list.add(bbubbush);
        list.add(junu);

        System.out.println("[Before Sort]");
        list.stream().forEach((member -> System.out.println(member.toString())));
        Collections.sort(list);
        System.out.println("[After Sort]");
        list.stream().forEach((member -> System.out.println(member.toString())));

    }
}

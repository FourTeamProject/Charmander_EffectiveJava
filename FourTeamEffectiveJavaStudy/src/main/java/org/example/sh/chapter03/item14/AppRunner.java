package org.example.sh.chapter03.item14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member(2L, "imesung", 30L));
        members.add(new Member(4L, "ssinsa", 28L));
        members.add(new Member(1L, "bbubbush", 31L));
        members.add(new Member(3L, "junu", 30L));

        System.out.println("[Before Sort]");
        members.stream().forEach((member -> System.out.println(member.toString())));

        Collections.sort(members, Collections.reverseOrder());

        System.out.println("[After Sort]");
        members.stream().forEach((member -> System.out.println(member.toString())));
    }
}

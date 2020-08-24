package org.example.sh.chapter04.item17;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Member {
    private final Long id;
    private final String name;
    private final Long age;
    private final List<String> hobbies;

    public Member(Long id, String name, Long age, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public static void main(String[] args) {
        Member bbubbush = new Member(1L, "bbubbush", 2L, null);
    }
}

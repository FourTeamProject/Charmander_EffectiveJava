package org.example.sh.chapter04.item23;

public abstract class AbstractMember {
    // 공통 속성
    final Long id;
    final String name;

    public AbstractMember(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract public String findUserArea();
}

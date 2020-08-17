package org.example.sh.chapter03.item14;


public class Member implements Comparable<Member> {
    private final Long id;
    private final String name;
    private final Long age;

    public Member(Long id, String name, Long age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Member o) {
        return orderById(o);
    }
    private int orderById(Member o) {
        Long memberId = this.getId();
        Long targetId = o.getId();
        return memberId > targetId ? 1 : ((memberId == targetId) ? 0 : -1);
    }
    private int orderByName(Member o) {
        String memberName = this.getName();
        String targetName = o.getName();
        return memberName.charAt(0) > targetName.charAt(0) ? 1 : ((memberName.charAt(0) == targetName.charAt(0)) ? 0 : -1);
    }
    private int orderByAge(Member o) {
        Long memberAge = this.getAge();
        Long targetAge = o.getAge();
        return memberAge > targetAge ? 1 : ((memberAge == targetAge) ? 0 : -1);
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

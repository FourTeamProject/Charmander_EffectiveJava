package org.example.sh.chapter03.item14;


public class Member implements Comparable<Member> {
    private Long id;
    private String name;
    private Long age;

    public Member(Long id, String name, Long age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    private int sortById(Member o) {
        Long memberId = this.getId();
        Long targetId = o.getId();
        return memberId < targetId ? 1 : ((memberId == targetId) ? 0 : -1);
    }
    private int sortByName(Member o) {
        String memberName = this.getName();
        String targetName = o.getName();

        return memberName.charAt(0) < targetName.charAt(0) ? 1 : ((memberName.charAt(0) == targetName.charAt(0)) ? 0 : -1);
    }

    private int sortByAge(Member o) {
        Long memberAge = this.getAge();
        Long targetAge = o.getAge();

        return memberAge < targetAge ? 1 : ((memberAge == targetAge) ? 0 : -1);
    }

    @Override
    public int compareTo(Member o) {
        return sortById(o);
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

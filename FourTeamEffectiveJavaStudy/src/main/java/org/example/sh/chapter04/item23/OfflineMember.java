package org.example.sh.chapter04.item23;

public class OfflineMember extends AbstractMember{
    final String joinStoreName; // 회원이 가입한 점포 명

    public OfflineMember(Long id, String name, String joinStoreName) {
        super(id, name);
        this.joinStoreName = joinStoreName;
    }

    @Override
    public String findUserArea() {
        if ( "서울본점".equals(joinStoreName) ) {
            return "서울";
        }
        else if ( "경기 1호점".equals(joinStoreName) ) {
            return "경기";
        }
        else if ( "평양 2호점".equals(joinStoreName) ) {
            return "평양";
        }
        return "";
    }

    // 오프라인 회원가입을 유도한 점포에는 지원금을 추가해준다.
    public Long givePointToStore() {
        return addPointToStore(joinStoreName);
    }

    // Stub method
    private Long addPointToStore(String joinStoreName) {
        return 100L;
    }
}

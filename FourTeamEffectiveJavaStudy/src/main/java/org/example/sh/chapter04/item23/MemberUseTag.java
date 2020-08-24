package org.example.sh.chapter04.item23;

public class MemberUseTag {
    enum MemberType {ONLINE, OFFLINE};

    /* 공통 속성 */
    final MemberType memberType;
    final Long id;
    final String name;
    /* 온라인 회원만 사용 하는 속성 */
    final String ipAddress;     // 회원 IP 주소
    /* 오프라인 회원만 사용 하는 속성 */
    final String joinStoreName; // 회원이 가입한 점포 명

    private MemberUseTag(MemberType memberType, Long id, String name, String ipAddress, String joinStoreName) {
        this.memberType = memberType;
        this.id = id;
        this.name = name;
        this.ipAddress = ipAddress;
        this.joinStoreName = joinStoreName;
    }

    // 온라인 회원을 생성하는 static factory method
    public static MemberUseTag createOnlineMember(Long id, String name, String ipAddress) {
        return new MemberUseTag(MemberType.ONLINE, id, name, ipAddress, null);
    }
    // 오프라인 회원을 생성하는 static factory method
    public static MemberUseTag createOfflineMember(Long id, String name, String joinStoreName) {
        return new MemberUseTag(MemberType.OFFLINE, id, name, null, joinStoreName);
    }

    // 회원의 거주지역을 유추하여 리턴한다.
    public String findUserArea() {
        if ( memberType.equals(MemberType.ONLINE) ) {
            String[] ipArray = ipAddress.split("\\.");
            // IPv4 OR IPv6를 사용한다고 가정하며, 유효성 검사는 생략한다.
            int areaIpNumber = Integer.valueOf(ipArray[ipArray.length - 1]);
            if ( areaIpNumber > 0 && areaIpNumber <= 100 ) {
                return "서울";
            }
            else if ( areaIpNumber > 100 && areaIpNumber <= 200 ) {
                return "경기";
            }
            else if ( areaIpNumber > 200 && areaIpNumber <= 255 ) {
                return "평양";
            }
        }
        else if ( memberType.equals(MemberType.OFFLINE) ) {
            if ( "서울본점".equals(joinStoreName) ) {
                return "서울";
            }
            else if ( "경기 1호점".equals(joinStoreName) ) {
                return "경기";
            }
            else if ( "평양 2호점".equals(joinStoreName) ) {
                return "평양";
            }
        }
        return "";
    }

    // 오프라인 회원가입을 유도한 점포에는 지원금을 추가해준다.
    public Long givePointToStore() {
        if ( memberType.equals(MemberType.OFFLINE) ) {
            return addPointToStore(joinStoreName);
        }
        return 0L;
    }

    // Stub method
    private Long addPointToStore(String joinStoreName) {
        return 100L;
    }
}

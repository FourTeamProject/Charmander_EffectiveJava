package org.example.sh.chapter04.item23;

public class OnlineMember extends AbstractMember{
    final String ipAddress;     // 회원 IP 주소

    public OnlineMember( Long id, String name, String ipAddress) {
        super(id, name);
        this.ipAddress = ipAddress;
    }

    @Override
    public String findUserArea() {
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
        return "";
    }
}

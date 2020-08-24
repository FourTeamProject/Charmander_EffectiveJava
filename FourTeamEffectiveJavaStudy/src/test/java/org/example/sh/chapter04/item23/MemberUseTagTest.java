package org.example.sh.chapter04.item23;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberUseTagTest {

    @Test
    public void findUserAreaTest() {
        // given
        MemberUseTag onlineMember = MemberUseTag.createOnlineMember(10L, "bbubbush", "192.100.200.90");
        MemberUseTag offlineMember = MemberUseTag.createOfflineMember(20L, "bbubbush", "서울본점");
        String expectedOnlineUserArea = "서울";
        String expectedOfflineUserArea = "서울";

        // when
        String onlineMemberUserArea = onlineMember.findUserArea();
        String offlineMemberUserArea = offlineMember.findUserArea();

        // then
        assertEquals("온라인 회원의 지역이 기대값과 다릅니다.", expectedOnlineUserArea, onlineMemberUserArea);
        assertEquals("오프라인 회원의 지역이 기대값과 다릅니다.", expectedOfflineUserArea, offlineMemberUserArea);
    }

    @Test
    public void test() {
        // given
        MemberUseTag onlineMember = MemberUseTag.createOnlineMember(10L, "bbubbush", "192.100.200.90");
        MemberUseTag offlineMember = MemberUseTag.createOfflineMember(20L, "bbubbush", "서울본점");
        Long expectedOnlineStorePoint = 0L;
        Long expectedOfflineStorePoint = 100L;

        // when
        Long givePointToStoreOnline = onlineMember.givePointToStore();
        Long givePointToStoreOffline = offlineMember.givePointToStore();

        // then
        assertEquals("온라인 회원은 가맹점 지원금에 영향을 주지 않습니다.", expectedOnlineStorePoint, givePointToStoreOnline);
        assertEquals("오프라인 회원의 가맹점에 지원하는 금액이 기대값과 다릅니다.", expectedOfflineStorePoint, givePointToStoreOffline);
    }

}
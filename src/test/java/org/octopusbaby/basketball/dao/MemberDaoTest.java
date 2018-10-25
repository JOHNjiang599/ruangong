package org.octopusbaby.basketball.dao;

import org.junit.Test;
import org.octopusbaby.basketball.BaseTest;
import org.octopusbaby.basketball.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberDaoTest extends BaseTest {

    @Autowired
    private MemberDao memberDao;

    @Test
    public void testInsertMember() {
        int memberId = 23;
        String memberName = "john";
        String firstStart = "是";
        boolean b = memberDao.insertMember(memberId, memberName, firstStart);
    }

    @Test
    public void testQueryAllMember() {
        List<Member> members = memberDao.queryAllMember();
        for (Member member : members) {
            System.out.println("\n" + member);
        }
    }

    @Test
    public void testQueryByMemberId() {
        int memberId = 1;
        Member member = memberDao.queryByMemberId(memberId);
        System.out.println("\n" + member);
    }

    @Test
    public void testDelByMemberId() {
        int memberId = 1;
        boolean b = memberDao.delByMemberId(memberId);
    }

    @Test
    public void testModifyByMemberId() {
        int memberId = 1;
        String memberName = "john";
        String firstStart = "是";
        boolean b = memberDao.modifyByMemberId(memberId, memberName, firstStart);
    }
}

package org.octopusbaby.basketball.dao;

import org.junit.Test;
import org.octopusbaby.basketball.BaseTest;
import org.octopusbaby.basketball.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TeamDaoTest extends BaseTest {

    @Autowired
    private TeamDao teamDao;

    @Test
    public void testInsertTeam() {
        int teamId = 1;
        String teamName = "baby";
        boolean b = teamDao.insertTeam(teamId, teamName);
        if (b) {
            System.out.println("\n" + "成功添加一条数据");
        }
    }

    @Test
    public void testQueryAllTeam() {
        List<Team> teams = teamDao.queryAllTeam();
        for (Team team : teams) {
            System.out.println("\n" + team);
        }
    }

    @Test
    public void testQueryByTeamId() {
        int teamId = 2;
        Team team = teamDao.queryByTeamId(teamId);
        System.out.println("\n" + team);
    }

    @Test
    public void testDelByTeamId() {
        int teamId = 1;
        boolean b = teamDao.delByTeamId(teamId);
    }

    @Test
    public void testModifyByTeamId() {
        int teamId = 1;
        String teamName = "baby";
        boolean b = teamDao.modifyByTeamId(teamId, teamName);
    }
}

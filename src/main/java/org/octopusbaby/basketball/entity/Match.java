package org.octopusbaby.basketball.entity;

import java.io.Serializable;

public class Match implements Serializable {
    //比赛节
    private Integer matchSection;
    //比赛时刻
    private String matchTime;
    //事件类型 犯规0 加分1、2、3
    private Integer eventType;
    //球员ID
    private Integer memberId;
    //球队ID
    private Integer teamId;

    public Match(Integer matchSection, String matchTime, Integer eventType, Integer memberId, Integer teamId) {
        this.matchSection = matchSection;
        this.matchTime = matchTime;
        this.eventType = eventType;
        this.memberId = memberId;
        this.teamId = teamId;
    }

    public Match() {
        super();
    }

    public Integer getMatchSection() {
        return matchSection;
    }

    public void setMatchSection(Integer matchSection) {
        this.matchSection = matchSection;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime == null ? null : matchTime.trim();
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchSection=" + matchSection +
                ", matchTime='" + matchTime + '\'' +
                ", eventType=" + eventType +
                ", memberId=" + memberId +
                ", teamId=" + teamId +
                '}';
    }
}
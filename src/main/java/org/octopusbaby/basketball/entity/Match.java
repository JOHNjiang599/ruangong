package org.octopusbaby.basketball.entity;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Match implements Serializable {

    private int id;

    private String MatchTime;

    private int EventType;

    private int memberId;

    private int teamId;
}

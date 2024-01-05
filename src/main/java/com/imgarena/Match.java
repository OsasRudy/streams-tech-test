package com.imgarena;

import java.time.ZonedDateTime;

public class Match {
    private int matchId;
    private ZonedDateTime startDate;
    private String playerA;
    private String playerB;

    public Match(int matchId, ZonedDateTime startDate, String playerA, String playerB) {
        this.matchId = matchId;
        this.startDate = startDate;
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public int getMatchId() {
        return matchId;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public String getPlayerA() {
        return playerA;
    }

    public String getPlayerB() {
        return playerB;
    }
}

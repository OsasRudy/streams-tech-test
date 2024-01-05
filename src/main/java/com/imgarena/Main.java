package com.imgarena;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        int matchId = 1;
        Match match = new Match(matchId, ZonedDateTime.now(), "A", "B");

        MatchStore matchStore = new MatchStore();
        matchStore.saveMatch(match);

    }


}
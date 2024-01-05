package com.imgarena;

public class MatchStore {

    private int index;

    private Match[] matches;

    public MatchStore() {
        matches = new Match[20];
        index = 0;
    }

    public int getIndex() {
        return index;
    }

    public Match getMatch(int matchId) {
        for(Match m : matches) {
            if (m.getMatchId() == matchId) {
                return m;
            }
        }
        return null;
    }

    public void saveMatch(Match match) {
        if (index < 20) {
            matches[index] = match;
            index++;
        }
    }
}

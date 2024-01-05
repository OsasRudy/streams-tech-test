package com.imgarena;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MatchStoreTest {

    @Test
    void getMatch() {
    }

    @Test
    void saveMatch() {
        Match m = new Match(1, ZonedDateTime.now(), "A", "B");
        MatchStore store = new MatchStore();
        store.saveMatch(m);

        assertEquals(store.getMatch(1), m);
    }
}
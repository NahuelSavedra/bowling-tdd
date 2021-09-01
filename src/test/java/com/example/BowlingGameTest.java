package com.example;

import com.example.BowlingGame.BowlingGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void testGutterGame() throws Exception {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(0,bowlingGame.score());
    }
    @Test
    public void testAllOnes() throws Exception {
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(1);
        }
        assertEquals(20,bowlingGame.score());
    }

}

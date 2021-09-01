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
        rollMany(20,0);
        assertEquals(0,bowlingGame.score());
    }
    @Test
    public void testAllOnes() throws Exception {
        rollMany(20,1);
        assertEquals(20,bowlingGame.score());
    }
    @Test
    public void testOneSpare() throws Exception {
        rollSpare();
        bowlingGame.roll(3);
        rollMany(17,0);
        assertEquals(16, bowlingGame.score());
    }
    // Refactor Method
    private void rollMany(int n, int pins){
        for (int i = 0; i < n; i++) {
            bowlingGame.roll(pins);
        }
    }
    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }
}

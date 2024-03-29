package test.Task1;

import static org.junit.Assert.*;

import main.Task1.Task1Arcsin;
import org.junit.Test;

public class TestTask1Arcsin {
    private static final double DELTA = 0.2;

    @Test
    public void testArcsinZero() {
        assertEquals(0, Task1Arcsin.arcsin(0, 10), DELTA);
    }

    @Test
    public void testArcsinHalf() {
        assertEquals(Math.PI / 6, Task1Arcsin.arcsin(0.5, 10), DELTA);
    }

    @Test
    public void testArcsinMinusHalf() {
        assertEquals(-Math.PI / 6, Task1Arcsin.arcsin(-0.5, 10), DELTA);
    }
    @Test
    public void testArcsinOne() {
        assertEquals(Math.PI / 2, Task1Arcsin.arcsin(1, 10), DELTA);
    }

    @Test
    public void testArcsinMinusOne() {
        assertEquals(-Math.PI / 2, Task1Arcsin.arcsin(-1, 10), DELTA);
    }

    @Test
    public void testArcsinOutOfRange() {
        Task1Arcsin.arcsin(2, 10);
    }
}

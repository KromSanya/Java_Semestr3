package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareEquationTest {

    @org.junit.jupiter.api.Test
    public void testSolve() {
        double arr[] = new double[2];
        SquareEquation equation = new SquareEquation(3, -14, -5);
        arr = equation.solve();
        assertEquals(5.0, arr[0]);
        assertEquals(-0.333, arr[1], 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetException() {
        SquareEquation equation = new SquareEquation(1, 6, 14);
        equation.solve();
    }

}
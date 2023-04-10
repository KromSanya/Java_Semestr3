package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IFunc1ArgumentTest {

    @Test
    public void testLinearFunction() {
        LinearIFunc linearFunction = new LinearIFunc(1, 2, 1, 10);
       // assertEquals(linearFunction.getValue(2), 4);
        assertTrue(Math.abs(linearFunction.getValue(2) - 4) < 1E-3);
    }

    @Test
    public void testExpFunction() {
        ExpFunc expFunction = new ExpFunc(1, 2, 1, 0);
        assertTrue( Math.abs(expFunction.getValue(2) - 7.39) < 0.001);
    }

    @Test
    public void testSinFunction() {
        SinFunc sinFunction = new SinFunc(0, 1, 1, 1);
        assertTrue(sinFunction.getValue(0.1) - 0.099 < 0.001);
    }

    @Test
    public void testRationalFunction() {
        RationalFunc rationalFunction = new RationalFunc(10, 2, 1,1, 0, 10);
        assertTrue(rationalFunction.getValue(2) - 7.333 < 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testError() {
        ExpFunc expFunction = new ExpFunc(1, 2, 1, 0);
        expFunction.getValue(100);
    }
}
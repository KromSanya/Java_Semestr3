package org.example;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class IFunctionalTest {

    @Test(expected = IllegalArgumentException.class)
    public void testError() {
        ExpFunc expFunction = new ExpFunc(1, 2, 1, 0);
        IntegralFunctional<ExpFunc> integralFunctional = new IntegralFunctional<>(30, 50);
        assertEquals(0, integralFunctional.calculate(expFunction));
    }

    @org.junit.jupiter.api.Test
    public void testExpIntegral() {
        ExpFunc expFunction = new ExpFunc(1, 2, 1, 0);
        IntegralFunctional<ExpFunc> integralFunctional = new IntegralFunctional<>(1, 2);
        assertTrue(integralFunctional.calculate(expFunction) - 4.67 < 0.1);
    }

    @org.junit.jupiter.api.Test
    public void testSumFunctional() {
        SinFunc sinFunction = new SinFunc(0, 1, 1, 1);
        SumFunctional<SinFunc> sumFunctional = new SumFunctional<>(0, 0.5);
        assertTrue(sumFunctional.calculate(sinFunction) - 1.682 < 0.1);
    }
}
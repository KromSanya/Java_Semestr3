package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeightProductTest {
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullName() {
        WeightProduct product = new WeightProduct(null, "Description");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullDescription() {
        WeightProduct product = new WeightProduct("Name", null);
    }
}
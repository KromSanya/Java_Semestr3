package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PieceProductTest {

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeWeight() {
        PieceProduct product = new PieceProduct("Name", "description", -90.0);
    }
}
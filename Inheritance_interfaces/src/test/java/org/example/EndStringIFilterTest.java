package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EndStringIFilterTest {
    EndStringIFilter filter = new EndStringIFilter("раму");

    @Test
    public void testApplyOK() {
        assertTrue(filter.apply("мама мыла раму"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter.apply("мама Мыла рамку"));
        assertFalse(filter.apply("папа мыл что-то"));
    }
}
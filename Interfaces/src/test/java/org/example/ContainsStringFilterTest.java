package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsStringFilterTest {

    ContainsStringFilter filter = new ContainsStringFilter("мыла");

    @Test
    public void testApplyOK() {
        assertTrue(filter.apply("мама мыла раму"));
    }

    @Test
    public void testApplyFalse() {
        assertFalse(filter.apply("мама Мыла раму"));
        assertFalse(filter.apply("папа мыл раму"));
    }
}
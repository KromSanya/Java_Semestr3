package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    Product product = new Product("Пакет", "пластиковый пакет");

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullName() {
        Product product = new Product(null, "description string");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullDescription() {
        Product product = new Product("Name", null);
    }

    @Test
    public void ToString() {
        assertEquals("Товар Пакет (пластиковый пакет)",String.format("Товар %s (%s)", product.name, product.description));

    }
}
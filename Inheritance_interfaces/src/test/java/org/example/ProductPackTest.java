package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductPackTest {

    ProductPack product = new ProductPack("Пакет", 90.0);

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullName() {
        ProductPack productPack = new ProductPack(null, 90.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNegativeWeight() {
        ProductPack productPack = new ProductPack("Name", -10.0);
    }

    @Test
    public void ToString() {

        assertEquals("Товар Пакет (90.0)", String.format("Товар %s (%s)", product.getNamepack(), product.getWeight()));
    }
}
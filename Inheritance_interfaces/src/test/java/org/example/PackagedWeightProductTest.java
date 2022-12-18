package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PackagedWeightProductTest {
    PackagedWeightProduct product = new PackagedWeightProduct(new ProductPack("Пакет", 90.0),
            9000.99, new WeightProduct("Угли", "Древесные угли"));



    @Test
    public void testGetNetWeight() {
        assertEquals(product.getNetWeight(), 9000.99);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(product.getGrossWeight(), 9090.99);
    }

    @Test
    public void ToString() {
        System.out.println( String.format("Весовой товар '%s' с упаковкой '%s' (%fкг)",
                product.getName(), product.getNamepack(), product.getWeight()));
        assertEquals("Весовой товар 'Угли' с упаковкой 'Пакет' (9000,990000кг)",
                String.format("Весовой товар '%s' с упаковкой '%s' (%fкг)",
                product.getName(), product.getNamepack(), product.getWeight()));
    }
}
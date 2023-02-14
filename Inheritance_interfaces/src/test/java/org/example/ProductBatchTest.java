package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductBatchTest {
    ProductPack productPack = new ProductPack("Box", 10.0);
    PackagedProduct[] weightProducts = {new PackagedWeightProduct(productPack, 11.0, new WeightProduct("1", "2"))};

    ProductBatch productBatch = new ProductBatch("desc", weightProducts);

    @Test
    void getDescription() {
        assertEquals("desc", productBatch.getDescription());
    }

    @Test
    void getWeight() {
        assertEquals(productBatch.getWeight(), 21);
    }

    @Test
    void testGetProducts() {
        assertEquals(weightProducts, productBatch.getProducts());
    }
}
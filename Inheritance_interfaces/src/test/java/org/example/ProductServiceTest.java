package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Test
    public void testCountByFilter() {
        ProductPack productPackaging = new ProductPack("коробка", 10.0);
        PieceProduct apple = new PieceProduct("яблоки", "зеленые", 100.0);
        PackagedPieceProduct appleBox = new PackagedPieceProduct(productPackaging, 10, apple);
        ProductBatch batch = new ProductBatch("Партия товаров", appleBox);

        assertEquals(ProductService.countByFilter(batch, new BeginStringIFilter("яблоки")), 1);
        assertEquals(ProductService.countByFilter(batch, new ContainsStringIFilter("зеленые")), 0);
    }
}
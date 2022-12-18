package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PackagedPieceProductTest {
    PieceProduct product = new PieceProduct("apple", "green apple", 200.00);
    ProductPack pr = new ProductPack("pack", 10.0);
    PackagedPieceProduct packagedProduct = new PackagedPieceProduct(pr, 10, product);



    @Test
    public void ToString() {


        assertEquals("Штучный товар 'apple' с упаковкой 'pack' (10 штук)",String.format("Штучный товар '%s' с упаковкой '%s' (%d штук)",
                product.getName(), pr.getNamepack(), packagedProduct.getCount()) );
    }

    @Test
    public void testGetCount() {
        assertEquals(packagedProduct.getCount(), 10);
    }

    @Test
    public void testGetProduct() {
        assertEquals(packagedProduct.getProduct(), product);
    }

    @Test
    public void testGetNetWeight() {
        assertEquals(packagedProduct.getNetWeight(), 2000.0);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(packagedProduct.getGrossWeight(), 2010.0);
    }
}
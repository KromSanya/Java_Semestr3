package org.example;

abstract public class PackagedProduct extends Product {
    protected final ProductPack productPack;
    public PackagedProduct(String name, String description, ProductPack productPack) {
        super(name, description);
        this.productPack = productPack;
    }

    public ProductPack getProductPack() {
        return productPack;
    }

    abstract public double getNetWeight();

    abstract public double getGrossWeight();
}

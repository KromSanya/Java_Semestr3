package org.example;

import java.util.Arrays;

public class PackagedProductSet extends PackagedProduct {
    private final PackagedProduct[] products;

    public PackagedProductSet(String name, String description, ProductPack productPack, PackagedProduct... products) {
        super(name, description, productPack);
        this.products = products;
    }

    public PackagedProduct[] getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return String.format("Набор товаров в упаковке %s", productPack.getNamepack());
    }


    public double getNetWeight() {
        return Arrays.stream(products).mapToDouble(PackagedProduct::getGrossWeight).sum();
    }

    public double getGrossWeight() {
        return Arrays.stream(products).mapToDouble(PackagedProduct::getGrossWeight).sum() + productPack.getWeight();
    }
}
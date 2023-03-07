package org.example;

import java.util.Arrays;
import java.util.Objects;

public class ProductBatch {

    private String description;
    private PackagedProduct[] products;



    public ProductBatch(String description, PackagedProduct... products)
    {
        if( description == null) throw new IllegalArgumentException();
        this.description = description;
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public PackagedProduct[] getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductBatch that = (ProductBatch) o;
        return Objects.equals(description, that.description) && Arrays.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Партия товаров: %s %nТовары %s", description, Arrays.toString(products));
    }
    public double getWeight()
    {
        double grossweight = 0;
        for(int i = 0 ; i < products.length; i++)
        {
            grossweight+= products[i].getGrossWeight();
        }
        return grossweight;
    }
}


package org.example;

import java.util.Arrays;

public class ProductService {
    public static int countByFilter(ProductBatch batch, IFilter strFilter)
    {

        return (int) Arrays.stream(batch.getProducts()).
                filter(x -> strFilter.apply(x.getName())).count();
    }
}
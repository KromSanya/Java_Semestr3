package org.example;

import java.util.Arrays;

public class ProductService {
    public static int countByFilter(ProductBatch batch, IFilter strFilter)
    {
        int temp = 0;
        for(int i = 0; i < batch.getProducts().length; i++)
        {
            if(strFilter.apply(batch.getProducts()[i].getName()))
            {
                temp++;
            }
        }

        return temp;
    }
}
package org.example;

import java.util.Arrays;

public class MatrixService{

    public static void arrangeMatrices(Matrix[] matrices, MatrixComparator matrixComparator){
        for(int i = 0; i < matrices.length; i++)
        {
            Arrays.sort(matrices, matrixComparator);
        }
    }
}
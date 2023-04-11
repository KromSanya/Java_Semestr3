package org.example;

import java.util.Arrays;

public class UpTriangleMatrix extends Matrix {


    public UpTriangleMatrix(int size) {
        super(size);
    }
    @Override
    public double getIJ(int x, int y){
        if(x >= 0 && x < size && y >= 0 && y < size) {
            return matrix[x * size + y];
        }else {
            throw new IllegalArgumentException();
        }
    }
    @Override
    public void setIJ(int x, int y, double elem)
    {
        if(y>=x && x >= 0 && x < size && y < size)
        {
            matrix[x*size + y] = elem;
            actualDeterminant = false;
        }else{
            throw new IllegalArgumentException();
        }
    }
    public double getMatrixDeterm() {
        if (!actualDeterminant) {
            actualDeterminant = true;
            determinant = 1;
            double[] tmpArray = Arrays.copyOf(matrix, size * size);
            int i;
            for (i = 0; i < size; i++) {
                if (tmpArray[i * size + i] == 0) {
                    actualDeterminant = false;
                    return 0;
                } else {
                    determinant *= tmpArray[i * size + i];
                }
            }
            return determinant;
        }
        return determinant;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

package org.example;

import java.util.Arrays;

public class DiagMatrix extends Matrix implements IMatrix {
    public DiagMatrix(int size) {
        super(size);
    }

    public DiagMatrix(double... elements) {
        super(elements.length);
        for (int i = 0; i < size; i++) {
            this.setIJ(i, i, elements[i]);
        }
    }
    @Override
    public double getIJ(int i, int j) {
        if (i >= 0 && i < size && j >= 0 && j < size) {
            return matrix[i * size + j];
        } else {
            throw new IllegalArgumentException();
        }
    }
    @Override
    public void setIJ(int i, int j, double element) {
        if ((i == j || element == 0) && i >= 0 && i < size && j >= 0 && j < size) {
            matrix[i * size + j] = element;
            actualDeterminant = false;
        } else {
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

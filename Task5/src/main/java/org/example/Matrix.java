package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Matrix implements IMatrix {

    protected double[] matrix;
    protected final int size;
    protected boolean actualDeterminant = false;
    protected double determinant;

    public Matrix(int size) {
        if (size > 0) {
            this.size = size;
            matrix = new double[size * size];
        } else {
            throw new IllegalArgumentException();
        }

    }

    public Matrix(double[] matrix, int size) {
        this.matrix = matrix;
        this.size = size;
    }

    @Override
    public double getIJ(int x, int y) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            return matrix[x * size + y];
        } else {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public void setIJ(int x, int y, double elem) {
        if (x >= 0 && x < size && y >= 0 && y < size) {
            matrix[x * size + y] = elem;
            actualDeterminant = false;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getSize() {
        return size;
    }


    private static void swap(double[] arr, int size, int i1, int j1, int i2, int j2) {
        double temp = arr[i1 * size + j1];
        arr[i1 * size + j1] = arr[i2 * size + j2];
        arr[i2 * size + j2] = temp;
    }

    @Override
    public double getMatrixDeterm() {
        if (actualDeterminant) {
            return determinant;
        }

        actualDeterminant = true;
        determinant = 1;
        double[] tmpMatrix = Arrays.copyOf(matrix, size * size);
        double coefficient = 0;

        for (int i = 0; i < size; i++) {
            int index = i;
            while (index < size && tmpMatrix[index * size + i] == 0) {
                index++;
            }
            if (index == size) {
                determinant = 0;
                return determinant;
            }
            if (index != i) {
                for (int s = 0; s < size; s++) {
                    swap(tmpMatrix, size, index, s, i, s);
                }
                determinant *= -1;
            }

            for (int j = i + 1; j < size; j++) {
                coefficient = tmpMatrix[j * size + i] / tmpMatrix[i * size + i];
                for (int k = i; k < size; k++) {
                    tmpMatrix[j * size + k] -= tmpMatrix[i * size + k] * coefficient;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            determinant *= tmpMatrix[i * size + i];
        }
        return determinant;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix matrix1)) return false;
        return size == matrix1.size && actualDeterminant == matrix1.actualDeterminant && Double.compare(matrix1.determinant, determinant) == 0 && Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, actualDeterminant, determinant);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }
}

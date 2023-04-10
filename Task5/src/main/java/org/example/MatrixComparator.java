package org.example;

import java.util.Comparator;

public class MatrixComparator implements Comparator <Matrix> {
    @Override
    public int compare(Matrix matrix1, Matrix matrix2) {
        if(matrix1 == null || matrix2 == null) throw new IllegalArgumentException();
        return Double.compare(matrix1.getMatrixDeterm(), matrix2.getMatrixDeterm());
    }
}

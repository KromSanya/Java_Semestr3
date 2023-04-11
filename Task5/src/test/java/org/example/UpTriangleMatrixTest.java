package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpTriangleMatrixTest {
    UpTriangleMatrix utm1 = new UpTriangleMatrix(3);

    @Before
    public void setup() {
        utm1.matrix = new double[]{1, 2, 3, 0, 3, 3, 0, 0, 9};
    }



    @Test(expected = IllegalArgumentException.class)
    public void setIJTest() {
        utm1.setIJ(2, 0, 4);
    }

    @Test
    public void getDeterminantTest0() {
        assertEquals(27, utm1.getMatrixDeterm(), 0.001);
    }

    @Test
    public void actualDeterminantTest0() {
        Matrix matrix = new UpTriangleMatrix(3);
        matrix.matrix = new double[]
                {2, 4, 6, 0, 3, 3, 0, 0, 9};
        matrix.getMatrixDeterm(); // 54
        matrix.setIJ(1, 1, 5);
        assertEquals(90, matrix.getMatrixDeterm(), 0.001);
    }

    @Test
    public void actualDeterminantTest1() {
        Matrix matrix = new UpTriangleMatrix(4);
        matrix.matrix = new double[]
                {2, 4, 6, 8,
                        0, 3, 3, 3,
                        0, 0, 6, 9,
                        0, 0, 0, 7};
        matrix.getMatrixDeterm(); // 252
        matrix.setIJ(1, 1, 5);
        assertEquals(420, matrix.getMatrixDeterm(), 0.001);
    }



    @Test
    public void equalsTest() {
        UpTriangleMatrix utm2 = new UpTriangleMatrix(utm1.getSize());
        for (int i = 0; i < utm1.getSize(); i++) {
            for (int j = i; j < utm1.getSize(); j++) {
                utm2.setIJ(i, j, utm1.getIJ(i, j));
            }
        }
        assertEquals(utm1, utm2);
    }
}
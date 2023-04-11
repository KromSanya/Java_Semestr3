package org.example;



import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MatrixTest {
    Matrix m1 = new Matrix(3);
    Matrix m4 = new Matrix(3);
    Matrix m2 = new Matrix(3);

    Matrix m3 = new Matrix(4);

    Matrix m5 = new Matrix(4);

    Matrix zero = new Matrix(3);

    Matrix m6 = new Matrix(4);

    Matrix m250 = new Matrix(5);

    @Before
    public void setUp() throws Exception {
        m1.matrix = new double[]
                {2, 4, 6,
                3, 3, 3,
                4, 5, 9};
        m2.matrix = new double[]
                {-2, 4, 6,
                3, 3, 3,
                4, 5, -9};

        m3.matrix = new double[]
                {0, 2, 4, 6,
                0, 3, 8, 3,
                0, 4, 5, 9,
                1, 3, 4, 5};
        m4.matrix = new double[]
                {3, 3, 3,
                2, 4, 4,
                1, 3, 6};
        m5.matrix = new double[]
                {3, 1, 1, 1,
                1, 3, 1, 1,
                1, 1, 3, 1,
                1, 1, 1, 3};

        zero.matrix = new double[]
                {0, 1, 2,
                3, 0, 4,
                5, 6, 0};

        m6.matrix = new double[]
                {-1, 3, -5, 5,
                3, -3, 2, 7,
                6, 7, 5, 8,
                9, 2, -7, -2
                };

        m250.matrix = new double[]{
                3, -1, 0, -1, 0,
                0, 1, -2, 0, 2,
                0, -1, 0, 0, 4,
                3, 0, 6, -1, 3,
                5, 0, 3, 0, 1};

    }



    @Test(expected = IllegalArgumentException.class)
    public void setIJTestException() {
        m1.setIJ(0, 4, 999);
    }

    @Test
    public void getDeterminantTest0() {
        assertEquals(-18, m1.getMatrixDeterm(), 0.001);
    }

    @Test
    public void getDeterminantTest1() {
        assertEquals(258, m2.getMatrixDeterm(), 0.001);
    }

    @Test
    public void getDeterminantTest2() {
        assertEquals(48, m3.getMatrixDeterm(), 0.001);
    }

    @Test
    public void getDeterminantTest3() {
        assertEquals(18, m4.getMatrixDeterm(), 0.001);
    }


    @Test
    public void getDeterminantTest4() {
        assertEquals(48, m5.getMatrixDeterm(), 0.001);
    }

    @Test
    public void getDeterminantTest5() {
        assertEquals(56, zero.getMatrixDeterm(), 0.001);
    }

    @Test
    public void getDeterminantTest6() {
        assertEquals(7595, m6.getMatrixDeterm(), 0.001);
    }

    @Test
    public void getDeterminantTest7() {
        assertEquals(250, m250.getMatrixDeterm(), 0.001);
    }

    @Test
    public void actualDeterminantTest0() {
        Matrix matrix = new Matrix(3);
        matrix.matrix = new double[]
                {2, 4, 6, 3, 3, 3, 4, 5, 9};
        matrix.getMatrixDeterm(); // -18
        matrix.setIJ(0, 1, 5);
        assertEquals(-33, matrix.getMatrixDeterm(), 0.001);
    }

    @Test
    public void actualDeterminantTest1() {
        Matrix matrix = new Matrix(4);
        matrix.matrix = new double[]
                {2, 4, 6, 7,
                        3, 3, 3, 4,
                        5, 9, 12, 14,
                        1, 2, 5, 7};
        matrix.getMatrixDeterm(); // 5
        matrix.setIJ(0, 1, 5);
        assertEquals(-26, matrix.getMatrixDeterm(), 0.001);
    }

    @Test
    public void equalsTest0() {
        assertNotEquals(m1, m2);
    }

    @Test
    public void equalsTest1() {
        Matrix m4 = new Matrix(m1.getSize());
        for (int i = 0; i < m1.getSize(); i++) {
            for (int j = 0; j < m1.getSize(); j++) {
                m4.setIJ(i, j, m1.getIJ(i, j));
            }
        }
        assertEquals(m1, m4);
    }

}
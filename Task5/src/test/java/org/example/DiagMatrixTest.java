package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiagMatrixTest {

    DiagMatrix dm1 = new DiagMatrix(2, 3, 5);


    @Test(expected = IllegalArgumentException.class)
    public void setIJTest1() {
        dm1.setIJ(0, 1, 999);
    }

    @Test
    public void getDeterminantTest() {
        assertEquals(30, dm1.getDeterminant(), 0.001);
    }

    @Test
    public void actualDeterminantTest0() {
        Matrix matrix = new DiagMatrix(2, 4, 7);
        matrix.getMatrixDeterm(); // 42
        matrix.setIJ(0, 0, 5);
        assertEquals(140, matrix.getMatrixDeterm(), 0.001);
    }

    @Test
    public void actualDeterminantTest1() {
        Matrix matrix = new DiagMatrix(1, 3, 5, 7);
        matrix.getMatrixDeterm(); // 105
        matrix.setIJ(2, 2, 99);
        assertEquals(2079, matrix.getMatrixDeterm(), 0.001);
    }



    @Test
    public void equalsTest1() {
        DiagMatrix dm4 = new DiagMatrix(dm1.getSize());
        for (int i = 0; i < dm1.getSize(); i++) {
            dm4.setIJ(i, i, dm1.getIJ(i, i));
        }
        assertEquals(dm1, dm4);
    }

}
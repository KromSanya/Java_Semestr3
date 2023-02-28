/*
package org.example;

public class EquationSolver {
    private SquareEquation sq;
    private double[] arr = new double[2];

    public EquationSolver(SquareEquation sq) {
        this.sq = sq;
    }

    public double getMax()
    {
        arr = sq.solve();
        if(arr[0] >= arr[1]) {
            return arr[0];
        }
        else {
            return arr[1];
        }
    }

    @Override
    public String toString() {
        return String.format("Equation: %fa + %fb + %f = 0", sq.getA(), sq.getB(), sq.getC());
    }

    public SquareEquation getSq() {
        return sq;
    }

    public void setSq(SquareEquation sq) {
        this.sq = sq;
    }



    public void setArr(double[] arr) {
        this.arr = arr;
    }
}
*/
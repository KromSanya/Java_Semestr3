package org.example;

public class SinFunc implements IFunc1Argument {
    double A, B;
    double right, left;

    public SinFunc(double left, double right, double a, double b) {
        this.left = left;
        this.right = right;
        A = a;
        B = b;
    }

    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x > right || x < left) throw new IllegalArgumentException();

        return A * Math.sin(B * x);
    }

    @Override
    public double getRight() {
        return right;
    }

    @Override
    public double getLeft() {
        return left;
    }
}


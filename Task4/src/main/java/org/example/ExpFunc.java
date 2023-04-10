package org.example;

public class ExpFunc implements IFunc1Argument {
    double A, B;
    double right, left;

    public ExpFunc(double left, double right, double a, double b) {
        this.right = right;
        this.left = left;
        this.A = a;
        this.B = b;
    }

    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x > right || x < left) throw new IllegalArgumentException();
        return A * Math.exp(x) + B;
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


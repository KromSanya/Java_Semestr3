package org.example;

public class LinearIFunc implements IFuncIArgument {
    double A, B;
    double right, left;

    public LinearIFunc(double a, double b, double left, double right) {
        A = a;
        B = b;
        this.left = left;
        this.right = right;
    }
    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x > right || x < left) throw new IllegalArgumentException();
        return A * x + B;
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


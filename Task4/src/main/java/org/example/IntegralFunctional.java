package org.example;

public class IntegralFunctional<T extends IFunc1Argument> implements IFunctional<T> {
    private final double right, left;

    public IntegralFunctional(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(T func)  {
        if (left < func.getLeft() || right > func.getRight()) throw new IllegalArgumentException();
        int n = 100;
        double result = 0.0;
        double fragment =  Math.abs(Math.abs(right) - Math.abs(left)) / n;
        for (int i = 0; i < n; i++) {
            result += func.getValue(left + i * fragment + fragment / 2) * fragment;
        }
        return result;
    }
}
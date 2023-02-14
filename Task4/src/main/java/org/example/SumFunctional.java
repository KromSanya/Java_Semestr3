package org.example;

public class SumFunctional<T extends IFuncIArgument> implements IFunctional<T> {
    private final double right, left;

    public SumFunctional(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(T func) {
        if (left < func.getLeft() || right > func.getRight()) throw new IllegalArgumentException();
        return func.getValue(func.getRight()) +
                func.getValue(func.getLeft()) +
                func.getValue((func.getRight() + func.getRight()) / 2);
    }
}
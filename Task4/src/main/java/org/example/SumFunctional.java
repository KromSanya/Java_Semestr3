package org.example;

public class SumFunctional<T extends IFunc1Argument> implements IFunctional<T> {
    private final double right, left;

    public SumFunctional(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(T func) {
//        if (left < func.getLeft() || right > func.getRight()) throw new IllegalArgumentException();
//        System.out.println(func.getValue(func.getRight()));
//        System.out.println(func.getValue(func.getLeft()));
//        System.out.println(func.getValue(func.getValue((func.getLeft() + func.getRight()) / 2)));
        return func.getValue(func.getRight()) +
                func.getValue(func.getLeft()) +
                func.getValue((func.getLeft() + func.getRight()) / 2);
    }
}
package org.example;

public interface IFunctional<T extends IFunc1Argument> {
    double calculate(T func);
}


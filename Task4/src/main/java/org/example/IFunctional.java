package org.example;

public interface IFunctional<T extends IFuncIArgument > {
    double calculate(T func);
}


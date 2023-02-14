package org.example;

import java.util.Arrays;

public class PolynomOfOneVar {
    double[] coef;

    public PolynomOfOneVar(double[] coef) {
        this.coef = coef;
    }

    public double calculate(double x)
    {
        double result = 0;
        for(int i = 0; i < coef.length; i++)
        {
            result += coef[i] * Math.pow(x, i);
        }
        return result;
    }

    public double calculateDiff(double x)
    {
        double result = 0;
        for(int i = coef.length; i > 0 ; i--)
        {
            result += coef[i] * i *  Math.pow(x, i-1);
        }
        return result;
    }

    @Override
    public String toString() {
        String str ="";
        for(int i = coef.length - 1; i >= 0; i = i -1)
        {
            if(coef[i] != 0 && coef[i] != 1 && i != 0)
            {
                str += coef[i] + "*x^" + i + " + ";
            }

            if(coef[i] == 1 && i != 0)
            {
                str += "x^" + i + " + ";
            }
            if( i == 0)
            {
                str += coef[i];
            }
        }


        return str;
    }

    public double getCoefI(int i) {
        return coef[i];
    }

    public void setCoefI(double coef, int i) {
        this.coef[i] = coef;
    }
}

package org.example;

public class SquareEquation extends PolynomOfOneVar {

    private double a, b, c;
    private double[] arr = new double[2];
    public SquareEquation(double[] coef, double a, double b, double c) {
        super(coef);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] solveEquation()
    {
        if(a == 0) throw new IllegalArgumentException();

        double D = (b*b) - (4*a*c);
        if(D < 0) throw new IllegalArgumentException();
        arr[0] = (-b + Math.sqrt(D))/(2*a);
        arr[1] = (-b - Math.sqrt(D))/(2*a);
        return arr;
    }

    public double findDisk()
    {
        double D = (b*b) - (4*a*c);
        return D;
    }

}

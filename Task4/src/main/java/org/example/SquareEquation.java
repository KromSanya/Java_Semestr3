package org.example;

public class SquareEquation {
    private double[] arr = new double[2];
    private double a, b, c;

    public SquareEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double[] solve()
    {
        if(a == 0) throw new IllegalArgumentException();

        double D = (b*b) - (4*a*c);
        if(D < 0) throw new IllegalArgumentException();
        arr[0] = (-b + Math.sqrt(D))/(2*a);
        arr[1] = (-b - Math.sqrt(D))/(2*a);
        return arr;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}

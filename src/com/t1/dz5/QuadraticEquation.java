package com.t1.dz5;

public class QuadraticEquation {
    private double a, b, c, x1, x2;
    private static final String errmessage = "Ошибка: Значение аргумента a = 0. Дальнейшая работа невозможна.";

    public QuadraticEquation(double a, double b, double c) throws IllegalArgumentException {
        if (a == 0) throw new IllegalArgumentException(errmessage);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws IllegalArgumentException {
        if (a == 0) throw new IllegalArgumentException(errmessage);
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

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public int Calculate()
    {
        double D;
        x1 = 0;
        x2 = 0;

        D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            return 2;
        }
        else if (D == 0) {
            x1 = -b / (2 * a);
            return 1;
        }
        else {
            return 0;
        }
    }
}

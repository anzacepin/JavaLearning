package com.t1.dz2;

public class Rectangle extends Figure3d{

    double a;
    double b;
    double c;

    public Rectangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double GetCubage() {
        return a*b*c;
    }

    @Override
    protected double GetSurfaceArea() {
        return 2*(a*b+a*c+b*c);
    }
}

package com.t1.dz2;

public class Cube extends Figure3d{

    double a;

    public Cube(String name, double a) {
        super(name);
        this.a = a;
    }

    @Override
    protected double GetCubage() {
        return a*a*a;
    }

    @Override
    protected double GetSurfaceArea() {
        return 6*a*a;
    }
}


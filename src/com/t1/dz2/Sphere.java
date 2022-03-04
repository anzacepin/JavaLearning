package com.t1.dz2;

public class Sphere extends Figure3d{
    double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    protected double GetCubage() {
        return (4*Math.PI*radius*radius*radius)/3;
    }

    @Override
    protected double GetSurfaceArea() {
        return 4*Math.PI*radius*radius;
    }
}

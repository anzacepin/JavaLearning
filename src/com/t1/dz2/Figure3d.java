package com.t1.dz2;

public abstract class Figure3d {
    String name;

    public Figure3d(String name) {
        this.name = name;
    }

    protected abstract double GetCubage();
    protected abstract double GetSurfaceArea();

    @Override
    public String toString() {
        return "Фигура: " +
                name + ' ' +
                "Объем='" + GetCubage() + ' ' +
                "Площадь поверхности='" + GetSurfaceArea()
                ;
    }
}

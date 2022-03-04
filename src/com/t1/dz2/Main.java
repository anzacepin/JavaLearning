package com.t1.dz2;

public class Main {
    //Домашнее задание № 2 - сделать абстрактный класс «трёхмерная фигура»,
    //с методами «объём» и «площадь поверхности». Написать его реализации
    // для шара, куба, прямоугольного параллепипеда.
    
    public static void main(String[] args){
        Figure3d[] figure3darr = {
                new Sphere("Шар", 10),
                new Cube("Куб", 11),
                new Rectangle("Прямоугольный параллелепипед", 12,13,14)};

        for (Figure3d figure3d: figure3darr
             ) {
            System.out.println(figure3d);
        }

    }
}

package com.t1.dz5;

public class Main {

    //задача - на исключения. Оформить решение квадратного уравнения в виде класса,
    // если этого ещё не сделали. Сбрасывать исключение java.lang.IllegalArgumentException,
    // если a=0. Сброс делать в конструкторе и в сеттере (если он есть).
    // Обеспечить перехват исключения в вызываемом коде.

    public static void main(String[] args) {
        double a, b, c, D;

        if (args.length<3){
            System.out.println("Недостаточно аргументов");
            System.exit(-1);
        }
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        QuadraticEquation qe = null;

        try {
            qe = new QuadraticEquation(a, b, c);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
            System.exit(-1);
        }

        int result = qe.Calculate();

        if (result > 0) {
            System.out.println("Корни уравнения: x1 = " + qe.getX1() + ", x2 = " + qe.getX2());
        }
        else if (result == 0) {
            System.out.println("Уравнение имеет единственный корень: x = " + qe.getX1());
        }
        else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}

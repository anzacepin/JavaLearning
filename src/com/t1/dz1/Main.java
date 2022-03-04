package com.t1.dz1;

public class Main {
    //Домашнее задание № 1 - сделать программу для решения квадратного уравнения
    // с действительными коэффициентами. Рассмотреть варианты с отсутствием
    // действительных корней, одним и двумя корнями.

    public static void main(String[] args) {
        double a, b, c, D;

        if (args.length<3){
            System.out.println("Недостаточно аргументов");
            System.exit(0);
        }
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней");
        }

    }
}

package com.t1.dz4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// программа на вход получает список школьников следующего вида:
        //
        //9 Иванов
        //10 Петров
        //11 Сидоров
        //9 Григорьев
        //9 Сергеев
        //10 Яковлев
        //В каждой строке сначала записан номер класса (число, равное 9, 10 или 11), затем (через пробел) – фамилия.
        // Необходимо вывести список по классам: сначала всех учащихся 1 класса, затем – 2, и так до 11.
        // Внутри класса выводить список учеников по алфавиту.
        //Задача учит работе с линейными списками и сортировкой.
        //Указание - создать класс "Ученик", реализовать для него интерфейс Comparable и воспользоваться методом sort()

        String[] inputdata = {"9 Иванов",
                "10 Петров",
                "11 Сидоров",
                "9 Григорьев",
                "9 Сергеев",
                "10 Яковлев"};
        ArrayList<Learner> learners = new ArrayList<>();
        try {
            for (String str: inputdata) {
                Learner l = new Learner(str);
                learners.add(l);
            }
        }
        catch (IncorrectInputDataException e) {
            System.out.println(e);
            System.exit(-1);
        }

        System.out.println(learners);
        Collections.sort(learners);
        System.out.println(learners);
    }
}

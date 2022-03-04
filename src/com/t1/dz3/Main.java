package com.t1.dz3;

import java.util.Locale;

public class Main {
    //Задача 1 (простая) - Дана строка. Проверить, является ли она палиндромом.
    public static void main(String[] args) {
        String[] strdata =  {
                "Я ем змея",
                "",
                "a",
                "Я не стар брат Сеня",
                "404",
                "ABBA",
                "В лесу родилась ёлочка",
                "abcd"
        };

        for (String onestr: strdata
             ) {
            if (IsPalindrome1(onestr)){
                System.out.println("Строка \"" + onestr + "\" является палиндромом");

            }else {
                System.out.println("Строка \"" + onestr + "\" НЕ палиндром");
            }
        }
    }

    //оптимальный метод проверки
    private static boolean IsPalindrome1(String instr){
        //удаляем все символы кроме кроме буквенного, цифрового или знака подчёркивания
        instr = instr.replaceAll("\\s", "");

        //инвертируем строку и сравниваем с первоначальной
        String instr2 = new StringBuilder(instr).reverse().toString();

        return instr.equalsIgnoreCase(instr2);
    }


    //метод из разряда "мы не ищем легких путей"
    private static boolean IsPalindrome2(String instr)    {
        boolean result = false;
        //удаляем все символы кроме кроме буквенного, цифрового или знака подчёркивания
        instr = instr.replaceAll("\\s+", "");

        //переводим все символы в нижний регистр
        instr = instr.toLowerCase();

        //пустая строка и строка из одного символа всегда палиндромом
        if ((instr.isEmpty()) || (instr.length()==1)) return true;

        int ileft = 0;
        int iright = instr.length()-1;

        //четное число символов или нет?
        if (instr.length() % 2 == 0){
            //четное
            while ((iright-ileft) != -1){
                if (instr.charAt(ileft) == instr.charAt(iright))
                {
                    result = true;
                    ileft++;
                    iright--;
                }else{
                    result = false;
                    break;
                }
            }
        }else {
            //нечетное
            while (ileft != iright){
                if (instr.charAt(ileft) == instr.charAt(iright))
                {
                    result = true;
                    ileft++;
                    iright--;
                }else{
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

}

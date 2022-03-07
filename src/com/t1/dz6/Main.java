package com.t1.dz6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//1. Создать абстрактный класс «Пользователь». У него должно быть публичное свойство «Логин», приватное свойство «пароль».
// 2. От «Пользователя» унаследовать конкретные классы «Покупатель», «Продавец».
// 3. У продавца есть дополнительный метод «Посмотреть активных покупателей» , а у покупателя дополнительные свойства "ФИО", "телефон" и "ID".
// 4. Есть исходный csv-файл со списком покупателей в формате: ФИО, Логин, пароль, телефон.
// 4.1 Если строчка парсится (т.е. для каждого из полей выполняются условия, которые вы сами зададите своими регулярками), то такой покупатель создается в системе через конструктор класса "Покупатель". Таким образом,должна появиться коллекция покупателей с присвоенными ID.
// 4.2 Если какая-то строка не парсится корректно, то выдается исключение. Исключение должно быть перехвачено, чтобы оно не приводило к аварийному завершению программы.
// 5. Далее происходит вызов метода продавца  «Посмотреть активных покупателей», в котором реализован вывод в итоговый csv-файл с сортировкой покупателей по ФИО. Сортировку реализовать с помощью интерфейса "Comparable".

public class Main {
    public static void main(String[] args) {

        ArrayList<Buyer> buyers = new ArrayList<>();
        BufferedReader reader = null;
        boolean result = true;

        try
        {
            reader = new BufferedReader(new FileReader("buyers.csv"));
            String line;
            while ( (line= reader.readLine()) != null){

                BuyersValidator validator = new BuyersValidator(line);
                validator.Validate();
                buyers.add(new Buyer(validator.FIO, validator.Login, validator.Password, validator.Phone));
            }
        }
        catch (IOException e) {
            result = false;
            System.out.println(e);
        }
        catch (IncorrectInputException e){
            result = false;
            System.out.println(e);
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    result = false;
                    System.out.println(e);
                }
            }
        }

        if (result == false) {
            System.out.println("Дальнейшая работа программы невозможна");
            System.exit(-1);
        }

        Saler saler = new Saler("saler", "richman", "activebuyers.csv");
        saler.ShowActiveBuyers(buyers);
    }
}

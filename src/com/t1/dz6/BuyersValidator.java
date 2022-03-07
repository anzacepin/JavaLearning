package com.t1.dz6;

public class BuyersValidator {

    private String InputString;
    public String FIO;
    public String Login;
    public String Password;
    public String Phone;

    public BuyersValidator (String inputstring)
    {
        this.InputString = inputstring;
    }
    public void Validate() throws IncorrectInputException
    {
        String[] parts = this.InputString.split(";");
        if (parts.length != 4) throw new IncorrectInputException(this.InputString);

        if (!this.isFIO(parts[0])) throw new IncorrectInputException(this.InputString, parts[0]);
        if (!this.isLogin(parts[1])) throw new IncorrectInputException(this.InputString, parts[1]);
        if (!this.isPassword(parts[2])) throw new IncorrectInputException(this.InputString, parts[2]);
        if (!this.isPhone(parts[3])) throw new IncorrectInputException(this.InputString, parts[3]);

        this.FIO = parts[0];
        this.Login = parts[1];
        this.Password = parts[2];
        this.Phone = parts[3];
    }

    private boolean isFIO(String x) {
        //1. Каждое слово начинается с большой буквы
        //2. Только буквы русского алфавита
        //3. Хотя бы один пробел находится между фамилией и именем, а так же между именем и отчеством
        String fioRegex = "[А-Я][а-я]+\\s+[А-Я][а-я]+\\s+[А-Я][а-я]+";
        return x.matches(fioRegex);
    }

    private boolean isLogin(String x) {
        //1. Только буквы латинского алфавита (заглавные и строчные в любом месте)
        //2. Количество символов от 4 до 8
        String loginRegex = "[A-Za-z]{4,8}";
        return x.matches(loginRegex);
    }

    private boolean isPassword(String x){
        //1. Буквы латинского алфавита (заглавные и строчные в любом месте)
        //2. Цифры (в любом месте)
        //3. Количество символов от 10 до 50
        String passwordRegex = "[A-Za-z\\d]{10,50}";
        return x.matches(passwordRegex);
    }

    private boolean isPhone(String x){
        //1. Тире могут быть, могут не быть
        //2. Скобки могут быть, могут не быть
        //3. Может начинаться на +7 или на 8
        //4. Пробелы могут быть, могут не быть
        //5. Вместо тире могут быть пробелы
        String phoneRegex = "(\\+7|8)\\s?[(]?\\d{3}[)]?\\s?\\d{3}([-]|\\s)?\\d{2}([-]|\\s)?\\d{2}";
        return x.matches(phoneRegex);
    }
}
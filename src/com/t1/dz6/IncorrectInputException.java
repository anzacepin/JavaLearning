package com.t1.dz6;

public class IncorrectInputException extends Exception{
    String instr;
    String token;

    public IncorrectInputException(String instr, String token) {
        this.instr = instr;
        this.token = token;
    }

    public IncorrectInputException(String instr) {
        this.instr = instr;
        this.token = null;
    }

    @Override
    public String toString() {
        if (token == null) return "Строка не корректна: " + this.instr;
        else return "Не корректные данные: " + token + System.lineSeparator() + "Строка, содержащая не корректные данные: " + instr;
    }
}


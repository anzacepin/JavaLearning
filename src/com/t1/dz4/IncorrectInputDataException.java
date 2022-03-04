package com.t1.dz4;

public class IncorrectInputDataException extends Exception{
    String instr;

    public IncorrectInputDataException(String instr) {
        this.instr = instr;
    }

    @Override
    public String toString() {
        return "Входная строка не корректна: " + instr;
    }
}


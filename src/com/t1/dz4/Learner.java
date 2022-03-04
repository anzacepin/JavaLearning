package com.t1.dz4;

public class Learner implements Comparable<Learner>{
    int rank;
    String name;

    public Learner(String initstr) throws IncorrectInputDataException {

        String[] initarr = initstr.split(" ");
        if (initarr.length<2) throw new IncorrectInputDataException(initstr);
        this.rank = Integer.parseInt(initarr[0]);
        this.name = initarr[1];
    }

    @Override
    public int compareTo(Learner o) {
        if (this.rank != o.rank) return this.rank-o.rank;
        else return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Класс=" + this.rank +
                ", Имя= " + this.name + System.lineSeparator();
    }
}

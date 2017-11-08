package com.it.JD01.classAndObj.tasksB.fraction.entity;

/**
 * Created by Denis on 29.10.2017.
 */
public class Fraction {
    private int ch;
    private int zn;

    public Fraction(){}
    public Fraction(int ch, int zn) {
        this.ch = ch;
        this.zn = zn;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getZn() {
        return zn;
    }

    public void setZn(int zn) {
        this.zn = zn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (ch != fraction.ch) return false;
        return zn == fraction.zn;
    }

    @Override
    public int hashCode() {
        int result = ch;
        result = 31 * result + zn;
        return result;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "ch=" + ch +
                ", zn=" + zn +
                '}';
    }
}

package com.it.JD01.javaBasics.tasksB.entity;

/**
 * Created by Denis on 02.11.2017.
 */
public class CandyWithLiqueurAndJelly extends Candy {
    private final double liquerLevel;
    private final double jellyLevel;

    public CandyWithLiqueurAndJelly(double sugarLevel, String name, double liquerLevel, double jellyLevel) {
        super(sugarLevel, name);
        this.liquerLevel = liquerLevel;
        this.jellyLevel = jellyLevel;
        super.mass = super.getSugarLevel()+this.liquerLevel+this.jellyLevel;
    }

    public double getLiquerLevel() {
        return liquerLevel;
    }

    public double getJellyLevel() {
        return jellyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandyWithLiqueurAndJelly that = (CandyWithLiqueurAndJelly) o;

        if (Double.compare(that.liquerLevel, liquerLevel) != 0) return false;
        return Double.compare(that.jellyLevel, jellyLevel) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(liquerLevel);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(jellyLevel);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CandyWithLiqueurAndJelly{" +
                "liquerLevel=" + liquerLevel +
                ", jellyLevel=" + jellyLevel +
                "} " + super.toString();
    }
}

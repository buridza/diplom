package com.it.JD01.javaBasics.tasksB.entity;

/**
 * Created by Denis on 02.11.2017.
 */
public class CandyWithMilkAndChocolate extends Candy {
    private final double milkLevel;
    private final double chocoLevel;


    public CandyWithMilkAndChocolate(double sugarLevel, String name, double milkLevel, double chocoLevel) {
        super(sugarLevel, name);
        this.milkLevel = milkLevel;
        this.chocoLevel = chocoLevel;
        super.mass = super.getSugarLevel()+this.milkLevel+this.chocoLevel;
    }

    public double getMilkLevel() {
        return milkLevel;
    }

    public double getChocoLevel() {
        return chocoLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandyWithMilkAndChocolate that = (CandyWithMilkAndChocolate) o;

        if (Double.compare(that.milkLevel, milkLevel) != 0) return false;
        return Double.compare(that.chocoLevel, chocoLevel) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(milkLevel);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(chocoLevel);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

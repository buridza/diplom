package com.it.JD01.javaBasics.tasksB.entity;

/**
 * Created by Denis on 02.11.2017.
 */
public class CandyWithFried extends Candy{
    private final double friedLevel;

    public CandyWithFried(double sugarLevel, String name, double friedLevel) {
        super(sugarLevel, name);
        this.friedLevel = friedLevel;
        super.mass = super.getSugarLevel()+this.friedLevel;
    }

    public double getFriedLevel() {
        return friedLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandyWithFried that = (CandyWithFried) o;

        return Double.compare(that.friedLevel, friedLevel) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(friedLevel);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "CandyWithFried{" +
                "friedLevel=" + friedLevel +
                "} " + super.toString();
    }
}

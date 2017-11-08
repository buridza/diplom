package com.it.JD01.javaBasics.tasksB.entity;

/**
 * Created by Denis on 02.11.2017.
 */
public class CandyWithChop extends Candy{
    private final double chopLevel;

    public CandyWithChop(double sugarLevel, String name, double chopLevel) {
        super(sugarLevel, name);
        this.chopLevel = chopLevel;
        super.mass = super.getSugarLevel()+this.chopLevel;
    }

    public double getChopLevel() {
        return chopLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandyWithChop that = (CandyWithChop) o;

        return Double.compare(that.chopLevel, chopLevel) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(chopLevel);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "CandyWithChop{" +
                "chopLevel=" + chopLevel +
                "} " + super.toString();
    }
}

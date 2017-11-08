package com.it.JD01.javaBasics.tasksB.entity;

/**
 * Created by Denis on 02.11.2017.
 */
abstract public class Chocolate extends Candy {
    private final double cocoaMassLevel;
    private final double cocoaButterLevel;
    private final boolean fruits;
    private final boolean almonds;

    protected Chocolate() {
        this.cocoaMassLevel = 0;
        this.cocoaButterLevel = 0;
        this.fruits = false;
        this.almonds = false;
    }

    protected Chocolate(double sugarLevel, String name, double cocoaMassLevel, double cocoaButterLevel, boolean fruits, boolean almonds) {
        super(sugarLevel, name);
        this.cocoaMassLevel = cocoaMassLevel;
        this.cocoaButterLevel = cocoaButterLevel;
        this.fruits = fruits;
        this.almonds = almonds;

    }

    public double getCocoaMassLevel() {
        return cocoaMassLevel;
    }

    public double getCocoaButterLevel() {
        return cocoaButterLevel;
    }

    public boolean isFruits() {
        return fruits;
    }

    public boolean isAlmonds() {
        return almonds;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chocolate chocolate = (Chocolate) o;

        if (Double.compare(chocolate.cocoaMassLevel, cocoaMassLevel) != 0) return false;
        if (Double.compare(chocolate.cocoaButterLevel, cocoaButterLevel) != 0) return false;
        if (fruits != chocolate.fruits) return false;
        return almonds == chocolate.almonds;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(cocoaMassLevel);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cocoaButterLevel);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fruits ? 1 : 0);
        result = 31 * result + (almonds ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "cocoaMassLevel=" + cocoaMassLevel +
                ", cocoaButterLevel=" + cocoaButterLevel +
                ", fruits=" + fruits +
                ", almonds=" + almonds +
                "} " + super.toString();
    }
}


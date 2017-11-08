package com.it.JD01.javaBasics.tasksB.entity;

/**
 * Created by Denis on 02.11.2017.
 */
public class ChocolateMilk extends Chocolate {
    private final double powderedMmilkLevel;

    public ChocolateMilk(double sugarLevel, String name, double cocoaMassLevel, double cocoaButterLevel, boolean fruits, boolean almonds, double powderedMmilkLevel) {
        super(sugarLevel, name, cocoaMassLevel, cocoaButterLevel, fruits, almonds);
        this.powderedMmilkLevel = powderedMmilkLevel;
        super.mass = super.getSugarLevel()+super.getCocoaButterLevel()+super.getCocoaMassLevel()+powderedMmilkLevel;
    }

    public double getPowderedMmilkLevel() {
        return powderedMmilkLevel;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ChocolateMilk that = (ChocolateMilk) o;

        return Double.compare(that.powderedMmilkLevel, powderedMmilkLevel) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(powderedMmilkLevel);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ChocolateMilk{" +
                "powderedMmilkLevel=" + powderedMmilkLevel +
                "} " + super.toString();
    }
}

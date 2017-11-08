package com.it.JD01.javaBasics.tasksB.entity;

/**
 * Created by Denis on 02.11.2017.
 */
public abstract class Candy {
    private final double sugarLevel;
    private final String name;
    protected double mass;

    protected Candy(){
        this.sugarLevel = 0.0;
        this.name = null;
    }

    protected Candy(double sugarLevel, String name) {
        this.sugarLevel = sugarLevel;
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public double getSugarLevel() {
        return sugarLevel;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "sugarLevel=" + sugarLevel +
                ", name='" + name + '\'' +
                '}';
    }
}

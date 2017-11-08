package com.it.JD01.classAndObj.tasksA.car;

import java.util.ArrayList;

/**
 * Created by Denis on 29.10.2017.
 */
public class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private int cost;
    private StringBuilder number;
    public static ArrayList<Car> allCar = new ArrayList<>();

    public Car(){}

    public Car(String brand, String model, int year, String color, int cost, StringBuilder number) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.cost = cost;
        this.number = number;
        this.id = this.hashCode();
        allCar.add(this);
    }
    public void addCar(){
        allCar.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public StringBuilder getNumber() {
        return number;
    }

    public void setNumber(StringBuilder number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (year != car.year) return false;
        if (cost != car.cost) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        return number != null ? number.equals(car.number) : car.number == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + cost;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}

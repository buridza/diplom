package com.it.JD01.classAndObj.tasksA.house;

import java.util.ArrayList;

/**
 * Created by Denis on 29.10.2017.
 */
public class House {
    private int id;
    private int numberApartament;
    private int square;
    private int floor;
    private int numberOfRoom;
    private String street;
    private String typeOfBuilding;
    private int lifetime;
    public static ArrayList<House> allHouse = new ArrayList<>();

    public House() {
    }

    public House(int numberApartament, int square, int floor, int numberOfRoom, String street, String typeOfBuilding, int lifetime) {
        this.numberApartament = numberApartament;
        this.square = square;
        this.floor = floor;
        this.numberOfRoom = numberOfRoom;
        this.street = street;
        this.typeOfBuilding = typeOfBuilding;
        this.lifetime = lifetime;
        this.id = this.hashCode();
        allHouse.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberApartament() {
        return numberApartament;
    }

    public void setNumberApartament(int numberApartament) {
        this.numberApartament = numberApartament;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeOfBuilding() {
        return typeOfBuilding;
    }

    public void setTypeOfBuilding(String typeOfBuilding) {
        this.typeOfBuilding = typeOfBuilding;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (id != house.id) return false;
        if (numberApartament != house.numberApartament) return false;
        if (square != house.square) return false;
        if (floor != house.floor) return false;
        if (numberOfRoom != house.numberOfRoom) return false;
        if (lifetime != house.lifetime) return false;
        if (street != null ? !street.equals(house.street) : house.street != null) return false;
        return typeOfBuilding != null ? typeOfBuilding.equals(house.typeOfBuilding) : house.typeOfBuilding == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + numberApartament;
        result = 31 * result + square;
        result = 31 * result + floor;
        result = 31 * result + numberOfRoom;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (typeOfBuilding != null ? typeOfBuilding.hashCode() : 0);
        result = 31 * result + lifetime;
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", numberApartament=" + numberApartament +
                ", square=" + square +
                ", floor=" + floor +
                ", numberOfRoom=" + numberOfRoom +
                ", street='" + street + '\'' +
                ", typeOfBuilding='" + typeOfBuilding + '\'' +
                ", lifetime=" + lifetime +
                '}';
    }
}

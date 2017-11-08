package com.it.JD01.classAndObj.tasksA.airline;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Denis on 28.10.2017.
 */
public class Airline {
    private String destination;
    private int flightNumber;
    private int aircraftType;
    private double departureTime;
    private boolean[] days;
    static ArrayList<Airline> allAirline= new ArrayList<>();
    Airline(){};

    public Airline(String destination, int flightNumber, int aircraftType, double departureTime, boolean[] days) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.days = days;
    }
    public void addAirline(){
        allAirline.add(this);
    }
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(int aircraftType) {
        this.aircraftType = aircraftType;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public boolean[] getDays() {
        return days;
    }

    public void setDays(boolean[] days) {
        this.days = days;
    }
    public boolean getDays(int index) {
        return days[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airline airline = (Airline) o;

        if (flightNumber != airline.flightNumber) return false;
        if (aircraftType != airline.aircraftType) return false;
        if (Double.compare(airline.departureTime, departureTime) != 0) return false;
        if (destination != null ? !destination.equals(airline.destination) : airline.destination != null) return false;
        return Arrays.equals(days, airline.days);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = destination != null ? destination.hashCode() : 0;
        result = 31 * result + flightNumber;
        result = 31 * result + aircraftType;
        temp = Double.doubleToLongBits(departureTime);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + Arrays.hashCode(days);
        return result;
    }

    @Override
    public String toString() {
        return "airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType=" + aircraftType +
                ", departureTime=" + departureTime +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}

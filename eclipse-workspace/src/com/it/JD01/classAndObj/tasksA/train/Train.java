package com.it.JD01.classAndObj.tasksA.train;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Denis on 28.10.2017.
 */
public class Train {
    private String destination;
    private int trainNumber;
    private double departureTime;
    private int[][] places;
    static ArrayList<Train> allTrain= new ArrayList<>();

    public Train(){};
    /*{
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                places[i][j]=i+j;
            }
        }
    }*/
    public Train(String destination, int trainNumber, double departureTime, int[][] places) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.places = places;
        allTrain.add(this);
    }
    public void addTrain(){
        allTrain.add(this);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public int[][] getPlaces() {
        return places;
    }

    public void setPlaces(int[][] places) {
        this.places = places;
    }
    public int[] getPlaces(int i) {
        return places[i];
    }
    public int getPlaces(String placeType) {
        if(placeType.equals("Общее"))
            return places[0][0];
        if(placeType.equals("Купе")) return places[1][0];
        if(placeType.equals("Плацкарт")) return places[2][0];
        if(placeType.equals("Люкс")) return places[3][0];
        return places[0][0];
    }

    @Override
    public String toString() {
        StringBuilder arr=new StringBuilder();
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                arr.append('[').append(places[i][j]).append(']');
            }
            //arr.append('\n');
        }
        String s= "train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                ", places=" + '['+arr +']'+
                '}';

        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (trainNumber != train.trainNumber) return false;
        if (Double.compare(train.departureTime, departureTime) != 0) return false;
        if (destination != null ? !destination.equals(train.destination) : train.destination != null) return false;
        return Arrays.deepEquals(places, train.places);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = destination != null ? destination.hashCode() : 0;
        result = 31 * result + trainNumber;
        temp = Double.doubleToLongBits(departureTime);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + Arrays.deepHashCode(places);
        return result;
    }
}

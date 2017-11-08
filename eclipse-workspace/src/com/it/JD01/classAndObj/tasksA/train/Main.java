package com.it.JD01.classAndObj.tasksA.train;

import java.util.Random;

/**
 * Created by Denis on 28.10.2017.
 */
public class Main {
    public static int[][] places(){
        int[][]places = new int[4][1];
        Random rand = new Random();

            places[0][0]=500-rand.nextInt(500);
            places[1][0]=300-rand.nextInt(300);
            places[2][0]=150-rand.nextInt(150);
            places[3][0]=50-rand.nextInt(50);


        return places;
    }
    public  static double time(Random rand){
        return (rand.nextInt(100)%24.0)+rand.nextInt(59)/100.0;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Train москва = new Train("Москва", rand.nextInt(1000), time(rand),places());
        //System.out.println();
        //москва.addTrain();
        Train минск = new Train("Минск", rand.nextInt(1000), time(rand),places());
        //минск.addTrain();
        //System.out.println();
        Train грозный = new Train("Грозный", rand.nextInt(1000), time(rand),places());
        //грозный.addTrain();
        //System.out.println();
        Train одесса = new Train("Одесса", rand.nextInt(1000), time(rand),places());
        //одесса.addTrain();
        Train вена = new Train("Вена", rand.nextInt(1000), time(rand),places());
        //вена.addTrain();
        Train милан = new Train("Милан", rand.nextInt(1000), time(rand),places());
        //милан.addTrain();
        Train москва1 = new Train("Москва", rand.nextInt(1000), time(rand),places());
        //москва1.addTrain();
        Train москва2 = new Train("Москва", rand.nextInt(1000), time(rand),places());
       // москва2.addTrain();
        Train москва3 = new Train("Москва", rand.nextInt(1000), time(rand),places());
        //москва3.addTrain();
        for (int i = 0; i < Train.allTrain.size(); i++) {
            System.out.println(Train.allTrain.get(i));
        }
        System.out.println();
        for (int i = 0; i < Train.allTrain.size(); i++) {
            if(Train.allTrain.get(i).getDestination().equals("Москва")) {
                System.out.printf("%-35s %s\n", "Список рейсов по пункту назначения:", Train.allTrain.get(i));
                if (Train.allTrain.get(i).getDepartureTime() > 14.55)
                    System.out.printf("%-35s %s\n", "Список рейсов по времени:", Train.allTrain.get(i));
                if (Train.allTrain.get(i).getPlaces("Общее")>0)
                System.out.printf("%-35s %s\n", "Список рейсов по местам:", Train.allTrain.get(i));
            }
        }
    }
}

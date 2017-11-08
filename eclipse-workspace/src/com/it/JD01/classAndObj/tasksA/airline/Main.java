package com.it.JD01.classAndObj.tasksA.airline;

import java.util.Random;

/**
 * Created by Denis on 28.10.2017.
 */
public class Main {
    public static boolean[] days(){
        boolean[]days = new boolean[7];
        Random rand = new Random();
        for (int i = 0; i < days.length; i++) {
            days[i] = rand.nextBoolean();
        }
        return days;
    }
    public static void main(String[] args) {
        
        Random rand = new Random();
        Airline аделаида = new Airline("Аделаида", rand.nextInt(36), 747, (rand.nextInt(100)%24.0)+rand.nextInt(59)/100.0,days() );
        аделаида.addAirline();
        Airline ресистенсия = new Airline("Ресистенсия", rand.nextInt(36), 747, (rand.nextInt(100)%24.0)+rand.nextInt(59)/100.0,days() );
        ресистенсия.addAirline();
        Airline ламу = new Airline("Ламу", rand.nextInt(36), 747, (rand.nextInt(100)%24.0)+rand.nextInt(59)/100.0,days() );
        ламу.addAirline();
        Airline нуакшот = new Airline("Нуакшот", rand.nextInt(36), 747, (rand.nextInt(100)%24.0)+rand.nextInt(59)/100.0,days() );
        нуакшот.addAirline();
        Airline маскат = new Airline("Маскат", rand.nextInt(36), 747, (rand.nextInt(100)%24.0)+rand.nextInt(59)/100.0,days() );
        маскат.addAirline();
        //System.out.println((airline.allAirline));
        for (int i = 0; i < Airline.allAirline.size(); i++) {
            System.out.println(Airline.allAirline.get(i));
        }
        for (int i = 0; i < Airline.allAirline.size(); i++) {
            if(Airline.allAirline.get(i).getDestination().equals("Аделаида")) System.out.printf("%-35s %s\n","Список рейсов по пункту назначения:" , Airline.allAirline.get(i));
            for (int j = 0; j < 7; j++) {
                boolean[] daysForPerson = {true, false, true, true, false, false, false};
                if(Airline.allAirline.get(i).getDays(j)&&daysForPerson[j]) System.out.printf("%-35s %s\n","Список рейсов по дням:" , Airline.allAirline.get(i));
            }
            if(Airline.allAirline.get(i).getDepartureTime()>12.56) System.out.printf("%-35s %s\n","Список рейсов по времени:" , Airline.allAirline.get(i));

        }
        Airline a1 = new Airline();
        Airline a2 = new Airline();
        if(a1.equals(a2)) System.out.println(true);
        else System.out.println(false);
    }

}

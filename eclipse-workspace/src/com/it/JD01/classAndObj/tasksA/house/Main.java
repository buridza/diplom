package com.it.JD01.classAndObj.tasksA.house;

import java.util.Random;

/**
 * Created by Denis on 29.10.2017.
 */
public class Main {
    public static String street(){
        Random random = new Random();
        String[] streets = {"Уманская","Лопатина","Краснослободская","40 лет победы", "Кульман", "Кальварийская", "Скрыганова"};
        return streets[random.nextInt(6)];
    }
    public static String typeOfBulding(){
        Random random = new Random();
        String[] streets = {"Деревянный","Кирпичный","Панельный","Каркасно-панельный", "Крупноблочный"};
        return streets[random.nextInt(4)];
    }
    public static House newHouse(){
        Random random = new Random();
        House house = new House(random.nextInt(1000), random.nextInt(200),random.nextInt(20),random.nextInt(10), street(), typeOfBulding(), random.nextInt(100));
        return house;
    }
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            newHouse();
        }
        /*for (int i = 0; i < House.allHouse.size(); i++) {
            System.out.println(House.allHouse.get(i));
        }*/
        for (int i = 0; i < House.allHouse.size(); i++) {
            if(House.allHouse.get(i).getNumberOfRoom()==4) {
                System.out.printf("%-25s %s\n","По числу комнат: ",House.allHouse.get(i));
                if(House.allHouse.get(i).getFloor()>12&&House.allHouse.get(i).getFloor()<20){
                    System.out.printf("%-25s %s\n","По числу комнат и этажу: ",House.allHouse.get(i));
                }
            }
            if(House.allHouse.get(i).getSquare()>150) {
                System.out.printf("%-25s %s\n","По площади: ",House.allHouse.get(i));
            }
        }

    }
}

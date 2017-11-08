package com.it.JD01.classAndObj.tasksA.car;

import java.util.Random;

/**
 * Created by Denis on 29.10.2017.
 */
public class Main {

    public static StringBuilder number(){
        Random random = new Random();
        StringBuilder lit = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            lit.append((char)(random.nextInt(25)+65));
        }
        lit.append('-');
        for (int i = 0; i < 3; i++) {
            lit.append(random.nextInt(9));
        }
        lit.append('-');
        lit.append(random.nextInt(7));
        //lit.append((char)random.nextInt())

        return lit ;
    }
    public static String carBrand(int index){
        String[] carBrands = {"Porshe", "BMW", "Audi", "Lada", "Tesla", "Mazda"};//5
        return carBrands[index];
    }
    public static String carModel(int index){
        String[] carModels = {"Хэтчбэк","Универсал","Седан","Купе","Лимузин","Минивэн","Кабриолет","Брогам","Пикап","Фургон"};
        return carModels[index];
    }
    public static Car newCar(){
        Random random = new Random();
        Car car1 = new Car(carBrand(random.nextInt(5)), carModel(random.nextInt(9)), random.nextInt(67)+1970, colors(random.nextInt(3)), random.nextInt(30)*1000,number());
        return car1;
    }
    public static String colors(int index){
        String [] colors = {"Yellow", "Red", "Blue", "Black"};
        return colors[index];
    }
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            newCar();
        }
        for (int i = 0; i < Car.allCar.size(); i++) {
            System.out.println(Car.allCar.get(i));
        }
        for (int i = 0; i < Car.allCar.size(); i++) {
            if(Car.allCar.get(i).getBrand().equals(carBrand(random.nextInt(5)))) {
                System.out.printf("%-25s %s\n", "Список по марке:",Car.allCar.get(i));
                if (Car.allCar.get(i).getYear() > 2011)
                    System.out.printf("%-25s %s\n", "Список марке и году:", Car.allCar.get(i));

            }
            if (Car.allCar.get(i).getYear()>2005&&Car.allCar.get(i).getCost()>25000)
                System.out.printf("%-25s %s\n", "Список по дате и цене:", Car.allCar.get(i));
        }
    }
}

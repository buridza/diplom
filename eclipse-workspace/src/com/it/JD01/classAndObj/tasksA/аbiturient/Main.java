package com.it.JD01.classAndObj.tasksA.аbiturient;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Denis on 29.10.2017.
 */
public class Main {
    public static String name(){
        Random random = new Random();
        String[] names = {"Ольга", "Алексей", "Алеся", "Полина", "Денис", "Дмитрий", "Евгений", "Сергей", "Илья"};
        return names[random.nextInt(8)];
    }
    public static String surname(){
        Random random = new Random();
        String[] surnames = {"Иванов", "Смирнов", "Попов", "Козлов", "Петров", "Кузнецов", "Соколов", "Морозов", "Волков"};
        return surnames[random.nextInt(8)];
    }
    public static String patronymic(){
        Random random = new Random();
        String[] patronomics = {"Алексеев", "Сергеевич", "Дмитриевич", "Евгениевич", "Ильич", "Петорович", "Денисович", "Алексеевич", "Павлович"};
        return patronomics[random.nextInt(8)];
    }
    public static String adress(){
        Random random = new Random();
        String[] streets = {"Уманская","Лопатина","Краснослободская","40 лет победы", "Кульман", "Кальварийская", "Скрыганова"};
        return streets[random.nextInt(7)]+", "+(random.nextInt(100)+1)+" кв. "+(random.nextInt(100)+1);
    }
    public static int phoneNumber(){
        Random random = new Random();
        String s=Integer.toString(5);
        int r= random.nextInt(9);
        if(r==0){
            s=Integer.toString(1);
        }
        for (int i = 0; i < 6; i++) {
            s+=Integer.toString(random.nextInt(9));
        }
        return Integer.parseInt(s);

    }
    public static int[] marks(){
        Random random = new Random();
        int[] marks = new int[12];
        for (int i = 0; i < 12; i++) {
            marks[i]=random.nextInt(10);
        }
        return marks;
    }
    public static Abiturient newAbiturient(){
        Abiturient abiturient = new Abiturient(name(),surname(),patronymic(), adress(), phoneNumber(), marks());
        return abiturient;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int n=0;
        for (int i = 0; i < 30; i++) {
            newAbiturient();
        }
        ArrayList<Abiturient> clone = Abiturient.allAbiturient;
        for (int i = 0, j=0; i < Abiturient.allAbiturient.size(); i++) {
            boolean badMark = false;
            int max = 0;
            for (j = 0; j < Abiturient.allAbiturient.get(i).getMarks().length; j++) {
                if(Abiturient.allAbiturient.get(i).getMarks(j)<4) {
                    badMark = true;
                    break;
                }
            }

            if(badMark) System.out.printf("%-25s %s\n","С плохими оценками: ",Abiturient.allAbiturient.get(i));
            if(Abiturient.allAbiturient.get(i).getResult()>80) System.out.printf("%-25s %s\n","По баллу: ",Abiturient.allAbiturient.get(i));

            for (j = 0; j < clone.size(); j++) {
                if(clone.get(j).getResult()>max){
                    max = clone.get(j).getResult();
                }
            }
            for (j=0; j < clone.size()&&n<10; j++) {
                if(clone.get(j).getResult()==max) {
                    System.out.printf("%-25s %s\n","По максимальному баллу: ",clone.get(j));
                    clone.remove(j);
                    n++;
                }
            }
        }

    }
}

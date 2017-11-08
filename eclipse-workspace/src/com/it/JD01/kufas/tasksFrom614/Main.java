package com.it.JD01.kufas.tasksFrom614;

import java.util.Scanner;

/**
 * Created by Denis on 24.10.2017.
 */
public class Main {
    public static void t1(){
       /* 1. Имеется серия измерений элементов треугольника. Группы элементов пронумерованы. В серии в произвольном порядке могут встречаться такие группы элементов треугольника:

            1) основание и высота;

2) две стороны и угол между ними (угол задан в радианах);

3) три стороны.

    Разработать программу, которая запрашивает номер группы элементов, вводит соответствующие элементы и вычисляет площадь треугольника. Вычисления прекратить, если в качестве номера группы введен 0.*/
      Scanner sc = new Scanner(System.in);
      System.out.print("Введи номер группы: ");
      while(!sc.hasNextInt()) {
          System.out.println();
          System.out.println("Введи номер группы: ");
      }
      int request = sc.nextInt();
      double s = 0;
      while(request!=0) {
          switch (request) {
              case 1: {
                  System.out.print("Основание: ");
                  int osn = sc.nextInt();
                  System.out.println();
                  System.out.print("Высота: ");
                  int vis = sc.nextInt();
                  System.out.println();
                  s = 0.5 * osn * vis;
                  break;
              }
              case 2: {
                  System.out.print("1 сторона: ");
                  double st1 = sc.nextDouble();
                  System.out.println();
                  System.out.print("2 сторона: ");
                  double st2 = sc.nextDouble();
                  System.out.println();
                  System.out.print("Угол(в радианах): ");
                  double rec = sc.nextDouble();
                  System.out.println();
                  s = 0.5 * st1 * st2 * Math.sin(rec);
                  break;
              }
              case 3: {
                  System.out.print("1 сторона: ");
                  double a = sc.nextInt();
                  System.out.println();
                  System.out.print("2 сторона: ");
                  double b = sc.nextInt();
                  System.out.println();
                  System.out.print("3 сторона: ");
                  double c = sc.nextInt();
                  System.out.println();
                  double p1 = (a + b + c) / 2;
                  s=Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
                  break;
              }
          }
          //System.out.println();
          System.out.println(s);
          System.out.print("Введи номер группы: ");
          request = sc.nextInt();
          System.out.println();
      }
  }
    public static void t2(){/*
        2. Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой суммарный путь пробежит спортсмен за 7 дней?*/
        double sum = 10;
        for (int i = 0; i < 7; i++) {
            sum *= 1.1;
        }
        System.out.println("Спортсмен пробежал: " + sum);
    }
    public static void t3(){
/*

        3. Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
*/      int a=3;
        for (int i = 1; i <=8; i++) {
            System.out.println("За "+3*i +" час "+(a*=2) + " амеб");
        }
    }
    public static void t4(double h, double k){
/*
        4. Около стены наклонно стоит палка длиной х м. Один ее конец находится на расстоянии у м от стены. Определить значение угла а между палкой и полом для значений х = k м и у, изменяющегося от 2 до 3 м с шагом h м.*/
        for (double i = 2; i <= 3;i+=h) {
            System.out.printf("Когда y = %f угол = %f\n",i,i/k);
        }
    }
    public static void t5(){
        //5. У гусей и кроликов вместе 64 лапы. Сколько может быть кроликов и гусей (указать все сочетания)?
        for (int i = 0; i <= 16; i++) {
            System.out.printf("Кроликов: %-3d Гусей: %-3d\n", (64/4-i), i*2);
        }
    }
    public static void t6(){
       /* . Составить программу для проверки утверждения: «Результатами вычислений по формуле х2 + х + 17 при 0 ≥ х ≥ 15 являются простые числа». Все результаты вывести на экран.*/
        for (int i = 0; i <= 15; i++) {
            System.out.println("Для x: " + i + " результат: " + num(i*i+i+17));
        }

    }
    private static boolean num(int x){
        int d=1;
        int count = 0;
        while(d<=x&&count<3){
            if(x%d==0)
                count++;
            d++;
        }
        if(count==2)
            return true;
        else return false;
    }
    public static void t7(){
        /*9. Составить программу для проверки утверждения: «Результатами вычислений по формуле x2 + x + 41 при 0 ≥ х ≥ 40 являются простые числа». Все результаты вывести на экран.*/
        for (int i = 0; i <= 40; i++) {
            System.out.printf("Для х: %-3d результат уравнения %s\n", i,num(i*i+i+41)?"простой":"составной");
        }
    }
    public static void t8() {
       // 10. Составить программу -генератор простых чисел, в основу положить формулу 2 х2 + 29 при 0 ≥х ≥28.
        for (int i = 0; i <= 28; i++) {
            System.out.println(num(2*i*i+29)?(2*i*i+29):"");
        }
    }
    public static void main(String[] args) {
        t8();
    }

}

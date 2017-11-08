package com.it.JD01.kufas.taskFrom613;//package src;

import java.util.Arrays;

/**
 * Created by Denis on 23.10.2017.
 */
public class Main {
    //  1. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
    public static void t1(int n) {

        System.out.println((n % 10 + n / 10 % 10) == (n / 1000 % 10 + n / 100 % 10));
    }
    //  2. Сумма цифр данного трехзначного числа N является четным числом.
    public static void t2(int n) {

        System.out.println((n % 10 + n / 10 % 10 + n / 100 % 10) % 2 == 0);
    }
    // 3. Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х = т, х= п (т < п).
    public static void t3(int x1, int x2, int x, int y) {

        System.out.println(x > x1 && x < x2);
    }
    //4. Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
    public static void t4(int a) {

        System.out.println(Math.pow(a, 3) == (a % 10 + a / 10 % 10 + a / 100 % 10));
    }
    //   5. Целое число N является четным двузначным числом.
    public static void t5(int n) {

        System.out.println(n < 100 && n > 9 && n % 2 == 0);
    }
    // 6. Треугольник со сторонами а, b, с является равносторонним.
    public static void t6(int a, int b, int c) {

        System.out.println((a == b && b == c) && (a / Math.sin((double) a) == b / Math.sin((double) b)));
    }
    //  7. Треугольник со сторонами a, b, с является равнобедренным.
    public static void t7(int a, int b, int c) {

       /* boolean test= (a/Math.sin((double)a)==b/Math.sin((double)b))&&(a/Math.sin((double)a)==c/Math.sin((double)c));
        if(test) {
            if (a == b && a != c) {
                System.out.println(true);
            }
            if (a == c && a != b) {
                System.out.println(true);
            }
            if (c == b && a != c) {
                System.out.println(true);
            }
        }else System.out.println(false);*/
        System.out.println(!((a != b && a != c && c != b) || (a == b && a == c)));

         /*  int min = Math.min(a, Math.min(b, c));
           int max = Math.max(a, Math.max(b, c));
           a = b = max;
           c = min;*/

    }
    //  8. Среди чисел а, b, с есть хотя бы одна пара взаимно противоположных.
    public static void t8(int a, int b, int c) {

        System.out.println(a == -b || a == -c || b == -c);

    }
    //9. Числа а и b выражают длины катетов одного прямоугольного треугольника, а с и d — другого. Эти треугольники являются подобными.
    public static void t9(int a, int b, int c, int d) {

        System.out.println(a - c == b - d);
    }
    // 10. Даны три стороны одного и три стороны другого треугольника. Эти треугольники равновеликие, т.е. имеют равные площади.
    public static void t10(int a, int b, int c, int d, int e, int f) {

        double p1 = (a + b + c) / 2;
        double p2 = (d + e + f) / 2;
        System.out.println(Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c)) == Math.sqrt(p2 * (p2 - d) * (p2 - e) * (p2 - f)));
    }
    //  11. Данная тройка натуральных чисел а, b, с является тройкой Пифагора, т.е. c2 = a2 + b2.
    public static void t11(int a, int b, int c) {

        System.out.println(c * c == (a * a + b * b));
    }
    //12. Все цифры данного четырехзначного числа N различны.
    public static void t12(int n) {

        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 1000 % 10;
        int d = n / 100 % 10;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        System.out.println(arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]);
    }
    // 13. Данные числа х, у являются координатами точки, лежащей в первой координатной четверти.
    public static void t13(int x, int y) {

        System.out.println(x > 0 && y > 0);
    }
    //14. (x1, y1) и (х2, y2) — координаты левой верхней и правой нижней вершин прямоугольника. Точка А(х, у) принадлежит прямоугольнику.
    public static void t14(int x1, int y1, int x2, int y2, int ax, int ay) {

        System.out.println(ax > x1 && ax < x2 && ay < y1 && ay > y2);
    }
    //   15. Число с является средним арифметическим чисел а и b.
    public static void t15(double a, double b, double c) {

        System.out.println((a + b) / 2 == c);
    }
    //16. Натуральное число N является точным квадратом.
    public static void t16(int n) {

        System.out.println(Math.sqrt(n) * 10 % 10 == 0);
    }
    //17. Цифры данного четырехзначного числа N образуют строго возрастающую последовательность.
    public static void t17(int n) {

        int d = n % 10;
        int c = n / 10 % 10;
        int b = n / 100 % 10;
        int a = n / 1000 % 10;
        //int[] arr = {a,b,c,d};
        //Arrays.sort(arr);
        System.out.println(d > c && c > b && b > a);
    }
    //18. Цифры данного трехзначного числа N являются членами арифметической прогрессии.
    public static void t18(int n) {

        int d = n % 10;
        int c = n / 10 % 10;
        int b = n / 100 % 10;
        //int a=n/1000%10;
        System.out.println((d - c) == (c - b));
    }

    // 19. Цифры данного трехзначного числа N являются членами геометрической прогрессии.
    public static void t19(int n) {

        int d = n % 10;
        int c = n / 10 % 10;
        int b = n / 100 % 10;
        //int a=n/1000%10;
        System.out.println((d - c) == (c - b));
    }
    // 20. Данные числа с и d являются соответственно квадратом и кубом числа а.
    public static void t20(int a, int b, int c) {

        System.out.println(a == c * c && a == b * b * b);
    }
    // 21. Цифра М входит в десятичную запись четырехзначного числа N.
    public static void t21(int n, int m) {

        System.out.println(m == n / 10 % 10);
    }
    //  22. Данное четырехзначное число читается одинаково слева направо и справа налево.
    public static void t22(int n) {

        System.out.println(n / 1000 % 10 == n % 10 && n / 100 % 10 == n / 10 % 10);
    }
    // 23. Шахматный конь за один ход может переместиться с одного заданного поля на другое (каждое поле задано двумя координатами — целыми числами от 1 до 8).
    public static void t23(int x, int y, int x1, int y1) {

        System.out.println((x == x1 - 2 || x == x1) && (y == y1 - 1 || y == y1 + 1));
    }
    // 24. В заданном натуральном трехзначном числе N имеется четная цифра.
    public static void t24(int n) {

        System.out.println(0 == n % 10 % 2 || n / 100 % 10 % 2 == 0 || 0 == n / 10 % 10 % 2);
    }
    // 25. Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
    public static void t25(int n) {

        int a = n % 10;
        int b = n / 10 % 10;
        // int c=n/1000%10;
        int d = n / 100 % 10;
        int[] arr = {a, b, d};
        Arrays.sort(arr);
        for (int h : arr
                ) {
            System.out.println(h);

        }
        System.out.println(arr[2] == (arr[1] + arr[0]));
        String s1=null;
        System.out.println(s1);
    }
    //  26. Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
    public static void t26(int N, int a) {

        System.out.println(Math.pow(a, 0) == N || Math.pow(a, 1) == N || Math.pow(a, 2) == N || Math.pow(a, 3) == N || Math.pow(a, 4) == N);
    }

    public static void main(String[] args) {
        t1(4569);
        t2(234);
        t3(4,6,4,1);
        t4(213);

        t25(523);

        //System.out.println();
    }
}

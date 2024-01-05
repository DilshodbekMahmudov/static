package com.lesson.statickeywordtask;

public class MathFunctions {

    private static double pi = 3.14159265359;
    private static double e = 2.71828182846;

    public static double hisoblaDoiraYuzi(double radius) {
        return pi * radius * radius;
    }

    public static double darajasigaOshiruvchi(double a) {
        return Math.pow(e, a);
    }

    public static double hisoblaUchburchakYuzi(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double doiraYuzi = hisoblaDoiraYuzi(5);
        double oshiruvchiNatija = darajasigaOshiruvchi(3);
        double uchburchakYuzi = hisoblaUchburchakYuzi(3, 4, 5);

        System.out.println("Doira yuzi: " + doiraYuzi);
        System.out.println("Oshiruvchi natija: " + oshiruvchiNatija);
        System.out.println("Uchburchak yuzi: " + uchburchakYuzi);
    }
}


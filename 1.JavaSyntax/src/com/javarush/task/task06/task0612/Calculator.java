package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int plus = a + b;
        return plus;
    }

    public static int minus(int a, int b) {
        int minus = a - b;
        return minus;
    }

    public static int multiply(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static double division(int a, int b) {
        double div = (double)a / b;
        return div;
    }

    public static double percent(int a, int b) {
        double perc = (double)(b * a) / 100;
        return perc;
    }

    public static void main(String[] args) {

    }
}
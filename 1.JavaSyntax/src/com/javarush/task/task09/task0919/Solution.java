package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void divideByZero () {
        System.out.println(8/0);
    }
}

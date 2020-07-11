package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

import org.w3c.dom.ranges.RangeException;

public class Solution {
    public static void main(String[] args) {
        int[] m = new int[2];
        try {
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }




        //напишите тут ваш код
    }
}

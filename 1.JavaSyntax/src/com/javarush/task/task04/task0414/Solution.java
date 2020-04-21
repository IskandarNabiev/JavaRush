package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nums = reader.readLine();
        int num = Integer.parseInt(nums);

        if (num % 4 != 0 || (num % 100 == 0 && num % 400 != 0))
            System.out.println("количество дней в году: 365");
        else
            System.out.println("количество дней в году: 366");


    }
}
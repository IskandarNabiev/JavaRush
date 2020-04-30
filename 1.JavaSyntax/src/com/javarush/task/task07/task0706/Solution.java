package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int even = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 || i == 0)
                even = even + numbers[i];
            else
                odd = odd + numbers[i];
        }

        if (odd > even)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else if (odd < even)
            System.out.println("В домах с четными номерами проживает больше жителей.");


    }
}

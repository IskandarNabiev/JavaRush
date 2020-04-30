package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        String[] words = new String[10];
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < words.length; i++) {
            words[i] = reader.readLine();

        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = words[i].length();
            System.out.println(numbers[i]);
        }
    }
}

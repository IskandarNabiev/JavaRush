package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        int i = 0;
        while (true) {
            int num = Integer.parseInt(reader.readLine());
            if (num == -1) {
                break;
            }
            else
                result = result + num;
                i++;
        }
        System.out.println(result/i);
    }
}


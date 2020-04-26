package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number == -1)
                break;
            else
                count++;
                sum += number;
        System.out.println(sum/count);
        }
    }
}


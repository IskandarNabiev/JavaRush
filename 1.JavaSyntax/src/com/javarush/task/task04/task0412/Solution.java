package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int snum = Integer.parseInt(num);
        if (snum > 0) {
            System.out.println(snum * 2);
        }
        else if (snum < 0) {
            snum++;
            System.out.println(snum);
        } else {
            System.out.println(0);
        }

    }

}
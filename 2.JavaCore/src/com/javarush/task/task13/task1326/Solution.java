package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList<Integer> list = new ArrayList();


        String line;
        while ((line = reader2.readLine()) != null) {
            int number = Integer.parseInt(line);
            list.add(number);
        }
        reader2.close();

        Collections.sort(list);
        for (Integer num: list) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }


    }
}

package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            array.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            String str = array.remove(4);
            array.add(0, str);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}

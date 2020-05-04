package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> str = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            str.add(reader.readLine());
        }
        int minStr = str.get(0).length();
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() < minStr) {
                minStr = str.get(i).length();
            }
        }
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() == minStr) {
                System.out.println(str.get(i));
            }
        }


    }
}

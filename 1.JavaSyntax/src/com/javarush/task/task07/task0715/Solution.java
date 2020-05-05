package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("мама");
        str.add("мыла");
        str.add("раму");
        str.add(1, "именно");
        str.add(3, "именно");
        str.add(5, "именно");

        for (String x : str) {
            System.out.println(x);
        }
    }
}

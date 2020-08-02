package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1d, "Alisa");
        labels.put(222d, "Alina");
        labels.put(333d, "Ak1isa");
        labels.put(444d, "Anfe2isa");
        labels.put(555d, "Aziza");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}

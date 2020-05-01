package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hi");
        array.add("hello");
        array.add("sdfs");
        array.add("adf");
        array.add("sda");
        System.out.println(array.size());
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

    }
}

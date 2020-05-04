package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(reader.readLine());
        }
        int maxStr = array.get(0).length();
        int minStr = array.get(0).length();
        for (int i = 0; i < array.size(); i++) {
            if (maxStr < array.get(i).length()) {
                maxStr = array.get(i).length();
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (minStr > array.get(i).length()) {
                minStr = array.get(i).length();
            }
        }

        int index = 0;
        for (int i = 0; i < array.size(); i++) {
            if (maxStr == array.get(i).length() || minStr == array.get(i).length()) {
                index = i;
                break;
            }
        }
        System.out.println(array.get(index));

    }
}

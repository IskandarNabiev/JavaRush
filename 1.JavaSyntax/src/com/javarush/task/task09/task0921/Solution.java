package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>();
        try {
            while (true) {
                int number = Integer.parseInt(reader.readLine());
                nums.add(number);
            }
        }
        catch (NumberFormatException | IOException e) {
            for (int i = 0; i < nums.size(); i++) {
                System.out.println(nums.get(i));
            }

        }

    }
}

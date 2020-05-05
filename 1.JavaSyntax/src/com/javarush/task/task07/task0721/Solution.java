package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (Integer.parseInt(reader.readLine()));
        }
        Arrays.sort(nums);
        int maximum = nums[19];
        int minimum = nums[0];

        System.out.print(maximum + " " + minimum);
    }
}

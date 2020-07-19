package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(num1);
//        nums.add(num2);
//        nums.add(num3);
//        Collections.sort(nums, Collections.reverseOrder());
//        for (Integer num: nums) {
//            System.out.println(num);
//        }

        //2й подход
        int[] numbers = {num1, num2, num3};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (Integer num: numbers) {
            System.out.println(num);
        }


    }
}

package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            num.add(Integer.parseInt(reader.readLine()));
        }
        int count = 1;
        int max = 1;
        for (int i = 0; i < num.size() - 1; i++) {
            if (num.get(i).equals(num.get(i + 1))) {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count = 1;
        }
        System.out.println(max);

    }
}
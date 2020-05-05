package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 3 == 0 & array.get(i) % 2 == 0){
                array1.add(array.get(i));
                array2.add(array.get(i));

            } else if (array.get(i) % 3 == 0 & array.get(i) % 2 != 0) {
                array1.add(array.get(i));

            } else if (array.get(i) % 2 == 0 & array.get(i) % 3 != 0) {
                array2.add(array.get(i));
            } else {
                array3.add(array.get(i));
            }
        }
        printList(array1);
        printList(array2);
        printList(array3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

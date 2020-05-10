package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        HashSet<Integer> nums = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) {
            nums.add(i);
        }
        return nums;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> num = set.iterator();
        while (num.hasNext()) {
            Integer n = num.next();
            if (n > 10)
                num.remove();
        }
        return (HashSet)set;
    }

    public static void main(String[] args) {

    }
}

package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Jones", "Jone");
        map.put("Jones2", "Jone");
        map.put("Jones3", "Jone");
        map.put("Jones4", "Jone");
        map.put("Jones5", "Jone");
        map.put("Jones6", "Jone");
        map.put("Jones7", "Jone");
        map.put("Jones8", "Jone");
        map.put("Jones9", "Jone");
        map.put("Jones10", "Jone");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> listValues = new ArrayList<>(map.values());
        for (String s : listValues) {
            if (Collections.frequency(listValues, s) > 1) {
                removeItemFromMapByValue(map, s);
            }
        }



    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}

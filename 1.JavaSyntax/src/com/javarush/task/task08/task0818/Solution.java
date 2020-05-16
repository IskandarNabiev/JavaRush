package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Nabiev", 1200);
        map.put("Nabiev2", 100);
        map.put("Nabiev3", 12000);
        map.put("Nabiev4", 21000);
        map.put("Nabiev5", 13000);
        map.put("Nabiev6", 500);
        map.put("Nabiev7", 130);
        map.put("Nabiev8", 2300);
        map.put("Nabiev9", 300);
        map.put("Nabiev10", 100);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> mapCopy = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair : mapCopy.entrySet()) {
            String name = pair.getKey();
            int price = pair.getValue();
            if (price < 500) {
                map.remove(name);
            }
        }
    }

    public static void main(String[] args) {

    }
}
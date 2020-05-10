package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<String, String>();
        people.put("Cejudo", "Henry5");
        people.put("Cejudo2", "Henry8");
        people.put("Cejudo3", "Henry7");
        people.put("Cejudo4", "Henry6");
        people.put("Cejudo5", "Henry7");
        people.put("Cejudo6", "Henry8");
        people.put("Cejudo7", "Henry9");
        people.put("Cejudo8", "Henry9");
        people.put("Cejudo9", "Henry10");
        people.put("Cejudo10", "Henry10");

        return people;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int num = 0;
        for (Map.Entry<String, String> pairs : map.entrySet()) {
            if (pairs.getValue().equals(name))
                num++;
        }
        return num;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int num = 0;
        for (Map.Entry<String, String> pairs : map.entrySet()) {
            if (pairs.getKey().equals(lastName))
                num++;
        }
        return num;
    }

    public static void main(String[] args) {

    }
}

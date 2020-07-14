package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Cat1", new Cat("Cat1name"));
        cats.put("Cat2", new Cat("Cat2name"));
        cats.put("Cat3", new Cat("Cat3name"));
        cats.put("Cat4", new Cat("Cat4name"));
        cats.put("Cat5", new Cat("Cat5name"));
        cats.put("Cat6", new Cat("Cat6name"));
        cats.put("Cat7", new Cat("Cat7name"));
        cats.put("Cat8", new Cat("Cat8name"));
        cats.put("Cat9", new Cat("Cat9name"));
        cats.put("Cat10", new Cat("Cat10name"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> catsSet = new HashSet<>(map.values());
        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

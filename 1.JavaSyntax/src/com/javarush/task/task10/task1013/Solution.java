package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private boolean sex;
        private short weight;
        private short height;
        private ArrayList<String> child;
        private ArrayList<String> parents;

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, boolean sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, boolean sex, short weight) {
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(int age, boolean sex, short weight, short height) {
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, boolean sex, short weight, short height, ArrayList<String> child) {
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.child = child;
        }

        public Human(int age, boolean sex, short weight, short height, ArrayList<String> child, ArrayList<String> parents) {
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
            this.child = new ArrayList<>();
            this.parents = new ArrayList<>();
        }

        public Human(boolean sex, short weight) {
            this.sex = sex;
            this.weight = weight;
        }

        public Human(boolean sex, short weight, short height) {
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(short weight, short height) {
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, short height) {
            this.age = age;
            this.height = height;
        }
    }
}

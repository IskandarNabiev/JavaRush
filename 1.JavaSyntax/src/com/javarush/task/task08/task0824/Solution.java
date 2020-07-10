package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        Human child1 = new Human("Egor", true, 18);
        Human child2 = new Human("Alex", true, 28);
        Human child3 = new Human("Masha", false, 19);

        Human father = new Human("Papa", true, 40, new ArrayList<>(Arrays.asList(child1, child2, child3)));
        Human mother = new Human("Mama", false, 40, new ArrayList<>(Arrays.asList(child1, child2, child3)));

        Human ded1 = new Human("Ded1", true, 80, new ArrayList<>(Arrays.asList(father)));
        Human baba1 = new Human("Baba1", false, 80, new ArrayList<>(Arrays.asList(father)));
        Human ded2 = new Human("Ded2", true, 80, new ArrayList<>(Arrays.asList(mother)));
        Human baba2 = new Human("Baba2", false, 80, new ArrayList<>(Arrays.asList(mother)));

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(ded1);
        System.out.println(baba1);
        System.out.println(ded2);
        System.out.println(baba2);
    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
//            System.out.println(children);
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

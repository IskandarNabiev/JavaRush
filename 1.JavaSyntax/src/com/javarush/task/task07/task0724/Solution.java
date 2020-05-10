package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Human> list = new ArrayList<>();
    public static void main(String[] args) {
        Human human1 = new Human("Ded", true, 80);
        Human human2 = new Human("Babushka", false, 70);
        Human human3 = new Human("Ded2", true, 77);
        Human human4 = new Human("Babushka2", false, 66);
        Human human5 = new Human("Otes", true, 22, human1, human2);
        Human human6 = new Human("Mat", false, 22, human3, human4);
        Human human7 = new Human("Alla", false, 22, human5, human6);
        Human human8 = new Human("Alla", false, 22, human5, human6);
        Human human9 = new Human("Alla", false, 22, human5, human6);
        for (Human human: list) {
            System.out.println(human);
        }




    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            list.add(Human.this);
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            list.add(Human.this);
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
              }

            return text;
        }
    }
}
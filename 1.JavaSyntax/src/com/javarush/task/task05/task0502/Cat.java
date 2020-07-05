package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int i = 0;
        int k = 0;
        if (this.age > anotherCat.age) {
            i++;
        }
        else if (this.age < anotherCat.age) {
            k++;
        }

        if (this.weight > anotherCat.weight) {
            i++;
        }
        else if (this.weight < anotherCat.weight) {
            k++;
        }

        if (this.strength > anotherCat.strength) {
            i++;
        }
        else if (this.strength < anotherCat.strength) {
            k++;
        }

        if (i > k) {
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 12;
        cat2.age = 11;
        System.out.println(cat1.fight(cat2));

    }
}

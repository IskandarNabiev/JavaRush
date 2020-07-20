package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move() {
            System.out.println("move");
        }
        public void eat() {
            System.out.println("eat");
        }
    }

    public class Duck implements CanEat, CanMove, CanFly {
        public void move() {
            System.out.println("move");
        }
        public void eat() {
            System.out.println("eat");
        }
        public void fly() {
            System.out.println("flying");
        }
    }

    public class Car implements CanMove {
        public void move() {
            System.out.println("move");
        }
    }

    public class Airplane implements CanFly, CanMove {
        public void fly() {
            System.out.println("flying");
        }
        public void move() {
            System.out.println("move");
        }
    }
}

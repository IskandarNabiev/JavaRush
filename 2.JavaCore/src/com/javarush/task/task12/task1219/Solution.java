package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
        public void run() {
            System.out.println("run");
        }
        public void swim() {
            System.out.println("swim");
        }

    }

    public class Duck implements CanSwim, CanRun, CanFly {
        public void swim() {
            System.out.println("swim");
        }
        public void run() {
            System.out.println("run");
        }
        public void fly() {
            System.out.println("fly");
        }

    }

    public class Penguin implements CanRun, CanSwim {
        public void run() {
            System.out.println("run");
        }
        public void swim() {
            System.out.println("swim");
        }

    }

    public class Airplane implements CanFly, CanRun {
        public void fly() {
            System.out.println("fly");
        }
        public void run() {
            System.out.println("run");
        }

    }
}

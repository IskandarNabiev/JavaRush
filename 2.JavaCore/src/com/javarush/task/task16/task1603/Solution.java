package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread thread = new SpecialThread();
        list.add(new Thread(thread));
        SpecialThread thread1 = new SpecialThread();
        list.add(new Thread(thread1));
        SpecialThread thread2 = new SpecialThread();
        list.add(new Thread(thread2));
        SpecialThread thread3 = new SpecialThread();
        list.add(new Thread(thread3));
        SpecialThread thread4 = new SpecialThread();
        list.add(new Thread(thread4));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}

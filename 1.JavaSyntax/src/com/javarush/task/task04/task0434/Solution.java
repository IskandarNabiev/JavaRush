package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x = 1;
        while (x < 11) {
            int y = 1;
            while (y < 11) {
                System.out.print(y * x + " ");
                y++;
            }
            System.out.println();
            x++;


        }
    }
}

package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        // Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
        //"четное однозначное число" - если число четное и имеет одну цифру,
        //"нечетное однозначное число" - если число нечетное и имеет одну цифру,
        //"четное двузначное число" - если число четное и имеет две цифры,
        //"нечетное двузначное число" - если число нечетное и имеет две цифры,
        //"четное трехзначное число" - если число четное и имеет три цифры,
        //"нечетное трехзначное число" - если число нечетное и имеет три цифры.
        //Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0 && a < 10 && a % 2 == 0) {
            System.out.println("четное однозначное число");
        }
        else if (a > 0 && a < 10 && a % 2 != 0) {
            System.out.println("нечетное однозначное число");
        }
        else if (a > 9 && a < 100 && a % 2 == 0) {
            System.out.println("четное двузначное число");
        }
        else if (a > 9 && a < 100 && a % 2 != 0) {
            System.out.println("нечетное двузначное число");
        }
        else if (a > 99 && a < 1000 && a % 2 == 0) {
            System.out.println("четное трехзначное число");
        }
        else if (a > 99 && a < 1000 && a % 2 != 0) {
            System.out.println("нечетное трехзначное число");
        }

    }
}

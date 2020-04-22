package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        // "отрицательное четное число" - если число отрицательное и четное,
        //"отрицательное нечетное число" - если число отрицательное и нечетное,
        //"ноль" - если число равно 0,
        //"положительное четное число" - если число положительное и четное,
        //"положительное нечетное число" - если число положительное и нечетное.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        if (num < 0 && num % 2 == 0) {
            System.out.println("отрицательное четное число");
        }
        else if (num < 0 && num % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        }
        else if (num == 0) {
            System.out.println("ноль");
        }
        else if (num > 0 && num % 2 == 0) {
            System.out.println("положительное четное число");
        }
        else if (num > 0 && num % 2 != 0) {
            System.out.println("положительное нечетное число");
        }

    }
}

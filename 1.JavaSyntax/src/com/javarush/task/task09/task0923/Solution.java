package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> glasniye = new ArrayList<>();
        ArrayList<Character> soglasniye = new ArrayList<>();
        String letter = reader.readLine();
        char[] lts = letter.toCharArray();
        for (char ch: lts) {
            if (isVowel(ch)) {
                glasniye.add(ch);
            }
            else if (!isVowel(ch) && ch != ' '){
                soglasniye.add(ch);
            }
        }

        for (char ch: glasniye) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (char ch2: soglasniye) {
            System.out.print(ch2 + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
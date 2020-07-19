package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        char[] ch = list.toString().toCharArray();
        ArrayList<Character> lstCh = new ArrayList<>();
        for (Character str: ch) {
            lstCh.add(str);
        }

        Map<Character, Integer> letter = new LinkedHashMap<>();
        for (int i = 0; i < alphabet.size(); i++) {
            letter.put(alphabet.get(i), Collections.frequency(lstCh, alphabet.get(i)));
        }
//        System.out.println(letter);

        for (Map.Entry<Character, Integer> map: letter.entrySet()) {
            Character key = map.getKey();
            Integer num = map.getValue();
            System.out.println(key + " " + num);
        }

}
}


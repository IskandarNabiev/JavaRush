package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
///home/in8/JavaRushTasks/2.JavaCore/src/com/javarush/task/task13/task1318/test.txt
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            System.out.print((char)data);
        }
        reader.close();
        inputStream.close();

    }
}
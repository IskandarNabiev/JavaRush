package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File myFile = new File(reader.readLine());
        BufferedWriter filewrite = new BufferedWriter(new FileWriter(myFile));
        try {
            while (true) {
                String text = reader.readLine();
                filewrite.write(text + System.lineSeparator());
                if (text.equals("exit")) {
                    break;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        filewrite.close();
    }
}

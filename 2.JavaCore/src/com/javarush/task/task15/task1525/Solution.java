package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();


    static {
        String inputFileName = Statics.FILE_NAME;
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFileName)))
        {
            // читаем посимвольно
            String line;
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }



    public static void main(String[] args) {
        System.out.println(lines);
    }
}

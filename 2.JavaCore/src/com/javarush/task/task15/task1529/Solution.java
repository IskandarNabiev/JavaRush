package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line.equals("helicopter")) {
            result = new Helicopter();

        }

        else if (line.equals("plane")) {
            int line2;
            line2 = Integer.parseInt(reader.readLine());
            result = new Plane(line2);
        }
        reader.close();
    }
}

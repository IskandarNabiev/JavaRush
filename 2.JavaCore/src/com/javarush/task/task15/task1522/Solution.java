package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        }
        else if (line.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        }
        else if (line.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        }
//        else  (!line.equals(Planet.EARTH) && !line.equals(Planet.MOON) && !line.equals(Planet.SUN)) {
//            thePlanet = null;
//        }
        else thePlanet = null;
    }
}

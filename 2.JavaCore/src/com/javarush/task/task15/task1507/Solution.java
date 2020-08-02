package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(2, 3, "8");
        printMatrix(4,5,9) ;
        printMatrix(4,5,2.4) ;
        printMatrix(4,5,'g') ;
        printMatrix(4,5,2.4f) ;
        printMatrix(4,5,(short)4) ;
        printMatrix(4,5,(byte)0) ;
        printMatrix(4,5,(long)34) ;
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, Character value) {
        System.out.println("Заполняем объектами Char");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Float value) {
        System.out.println("Заполняем объектами Float");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, short value) {
        System.out.println("Заполняем объектами Short");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, byte value) {
        System.out.println("Заполняем объектами Float");
        printMatrix(m, n, (Object) value);
    }



    public static void printMatrix(int m, int n, long value) {
        System.out.println("Заполняем объектами Float");
        printMatrix(m, n, (Object) value);
    }


    public static void printMatrix(int m, int n, int value) {
            System.out.println("Заполняем объектами Float");
            printMatrix(m, n, (Object) value);
        }


    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}

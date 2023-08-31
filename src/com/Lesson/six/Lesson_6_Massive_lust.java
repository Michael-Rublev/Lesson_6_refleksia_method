package com.Lesson.six;

import java.util.Arrays;

public class Lesson_6_Massive_lust {
    public static void main(String[] args) {
        int[][] arr = { //двухмерный массив
                {1, 2, 3}, //0 элемент массива
                {11, 22, 33}, //1 элемент массива
                {111, 222, 333}, //2 элемент массива
                {1111, 2222, 3333}, //2 элемент массива
                {11111, 22222, 33333}, //2 элемент массива
        };

        int max = Integer.MIN_VALUE;//поиск максимального значения в массиве
        for (int i = 0 ; i < arr.length; i++) {//цикл по массиву
            for (int j = 0; j < arr[i].length; j++) {//цикл по второму массиву
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max); //вывод индекса и эелемента массива с большим значением
    }
}

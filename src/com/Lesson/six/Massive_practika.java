package com.Lesson.six;

import java.util.Scanner;

public class Massive_practika {
    public static void main(String[] args) {

        System.out.println("Введите целое число: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        arr1[0] = 0;
        arr1[1] = 1;

        for (int i = 2; i < n; i++) {
            arr1[i] = arr1[i - 1] + arr1[i - 2];
        }
        System.out.println("Первые " + n + " чисел массива: ");

        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}

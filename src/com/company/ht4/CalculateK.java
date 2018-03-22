package com.company.ht4;

import java.util.Scanner;

public class CalculateK {

    private static int askData (String askString) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter" + askString + ": ");
        while(!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    private static boolean checkNumber (int element, int k) {
        if (element % k == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int calcSum(int[] mas, int k) {
        int summa = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = askData("array element");
            if (checkNumber(mas[i], k)) {
                summa += mas[i];
            }
        }
        return summa;
    }

    public static void main(String[] args ) {
        int arraySize, k, sum;

        arraySize = askData("array size");
        int[] array = new int[arraySize];
        k = askData("K");
        sum = calcSum(array, k);
        System.out.println("Summa: " + sum);

    }
}

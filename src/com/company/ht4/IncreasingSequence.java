package com.company.ht4;

public class IncreasingSequence {

    private static void enterArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 50);
            System.out.print(mas[i] + " ");
        }
    }

    private static boolean checkArray(int[] mas) {
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < mas[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        boolean isIncreasing;

        int sequencesize = 1 + (int) (Math.random() * 20);
        int[] sequence = new int[sequencesize];
        System.out.println("Sequence:");

        enterArray(sequence);
        isIncreasing = checkArray(sequence);

        System.out.println("\nResult: " + isIncreasing);
    }
}

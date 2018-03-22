package com.company.ht4;

public class CheckZero {

    private static void enterArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10) - 10;
            System.out.print(mas[i] + " ");
        }
    }

    private static void checkZero(int[] mas, int[] zeroMas) {
        int j = 0;
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] == 0) {
                zeroMas[j] = i;
                System.out.print(zeroMas[j] + " ");
                j++;
            }
        }
    }

    public static void main (String[] args) {
        int mas[] = new int[1 + (int)(Math.random()* 20)];
        int zeroMas[] = new int[mas.length];
        System.out.println("Sequence:");
        enterArray(mas);
        System.out.println("\nZero elements: ");
        checkZero(mas, zeroMas);
    }
}

package com.alevel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int quantityString = 9;
        int mas[][] = new int[quantityString][quantityString];
        for (int i = 0; i < quantityString; i++) {
            System.out.println("");
            for (int j = 0; j < quantityString; j++) {
                if (i == 0) {
                    mas[i][j] = 1;
                    System.out.println(mas[i][j] + "  ");
                    i++;
                }
                if ((j == 0 || j == i) || (i == 0 & j == 0)) {
                    mas[i][j] = 1;
                } else
                    mas[i][j] = mas[i - 1][j - 1] + mas[i - 1][j];
                if (mas[i][j] != 0)
                    System.out.print(mas[i][j] + "  ");
            }
        }
        System.out.println("");
        int[][] masNew = {{6, 1, 8},
                {7, 5, 3},
                {2, 9, 4}};
        for (int i = 0; i < masNew.length; i++) {
            System.out.println();
            for (int j = 0; j < masNew.length; j++) {
                System.out.print(masNew[i][j] + " ");
            }
        }
        System.out.println();
        // double magicConstDouble = (masNew.length) * (Math.pow(masNew.length, 2) + 1) / 2;
        int magicConst = (masNew.length) * ((masNew.length * masNew.length) + 1) / 2;
        System.out.println("Магическая константа для данного квадрата = " + magicConst);
        int sumString[] = new int[masNew.length];
        for (int i = 0; i < masNew.length; i++) {
            for (int j = 0; j < masNew.length; j++) {
                sumString[i] = sumString[i] + masNew[i][j];
            }
            System.out.print("Сумма строки " + (i + 1) + " = " + sumString[i]);
            if (sumString[i] == magicConst) {
                System.out.println(" равно " + magicConst);
            } else {
                System.out.println(" не равно " + magicConst + " Квадрат не магический :(");
                return;
            }
        }
        int sumStolb[] = new int[masNew.length];
        for (int j = 0; j < masNew.length; j++) {
            for (int i = 0; i < masNew.length; i++) {
                sumStolb[j] = sumStolb[j] + masNew[i][j];
            }
            System.out.print("Сумма столбца " + (j + 1) + " = " + sumStolb[j]);
            if (sumStolb[j] == magicConst) {
                System.out.println(" равно " + magicConst);
            } else {
                System.out.println(" не равно " + magicConst + " Квадрат не магический :(");
                System.out.print("");
                return;
            }
        }
        int firstDiagonal = 0;
        int i = 0;
        int j = masNew.length - 1;
        do {
            firstDiagonal = firstDiagonal + masNew[i][j];
            i++;
            j--;
        }
        while ((j + 1) != 0);
        System.out.print("Первая диагональ = " + firstDiagonal);
        if (firstDiagonal == magicConst)
            System.out.println(" равно " + magicConst);
        else {
            System.out.println(" не равно " + magicConst + " Квадрат не магический :(");
            return;
        }
        int secondDiagonal = 0;
        i = 0;
        j = 0;
        do {
            secondDiagonal = secondDiagonal + masNew[i][j];
            i++;
            j++;
        }
        while (i < masNew.length);
        System.out.print("Вторая диагональ = " + secondDiagonal);
        if (secondDiagonal == magicConst)
            System.out.println(" равно " + magicConst);
        else {
            System.out.println(" не равно " + magicConst + " Квадрат не магический :(");
            return;
        }
        System.out.print("Этот квадрат магический!!!");
    }
}
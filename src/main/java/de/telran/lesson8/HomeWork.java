package de.telran.lesson8;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое целое число для сравнения: ");
        int x = input.nextInt();
        System.out.print("Введите второе целое число для сравнения: ");
        int y = input.nextInt();
        System.out.print("Введите третье целое число для сравнения: ");
        int z = input.nextInt();

        int min;
        int mid;
        int max;

        if (x < y && y < z) {
            min = x;
            mid = y;
            max = z;
        } else if (x < z && z < y) {
            min = x;
            mid = z;
            max = y;
        } else if (y < x && x < z) {
            min = y;
            mid = x;
            max = z;
        } else if (y < z && z < x) {
            min = y;
            mid = z;
            max = x;
        } else if (z < x && x < y) {
            min = z;
            mid = x;
            max = y;
        } else {
            min = z;
            mid = y;
            max = x;
        }
        System.out.println("Выводим числа в порядке возрастания: " + min + " -> " + mid + " -> " + max);
        System.out.println("Выводим числа в порядке убывания: " + max + " <- " + mid + " <- " + min);
    }
}



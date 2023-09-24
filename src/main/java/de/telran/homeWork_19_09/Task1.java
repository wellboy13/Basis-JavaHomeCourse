package de.telran.homeWork_19_09;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // Создайте массив из 8 случайных целых чисел из интервала [1;50]
        int[] arrayRandom = new int[8];
        Random random = new Random();
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(50) + 1;
        }

        // Выведите массив на консоль в строку
        System.out.print("Рандомный массив: ");
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.print(arrayRandom[i] + ", ");
        }

        System.out.println();

        // Замените каждый элемент с нечетным индексом на ноль
        for (int i = 1; i < arrayRandom.length; i += 2) {
            arrayRandom[i] = 0;
        }

        // Выводим измененный массив на консоль
        System.out.print("Измененный массив: ");
        for (int i = 0; i < arrayRandom.length; i++) {
            System.out.print(arrayRandom[i] + ", ");
        }
    }
}


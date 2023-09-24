package de.telran.homeWork_19_09;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // Массив из 5 случайных целых чисел в интервале [10;99]
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        // Выводим массив на консоль
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        // Является ли массив строго возрастающей последовательностью
        boolean check = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                check = false;
                break;
            }
        }

        // Выводим результат
        if (check) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}

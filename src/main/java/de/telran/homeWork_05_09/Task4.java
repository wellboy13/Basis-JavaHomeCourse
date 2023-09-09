package de.telran.homeWork_05_09;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите исходную систему счисления = ");
        int inputSystem = scanner.nextInt();

        System.out.print("Введите число = ");
        String inStr = scanner.next();
        long inputNumber = Long.parseLong(inStr,inputSystem);

        System.out.print("В какую систему счисления преобразовать = ");
        int outputSystem = scanner.nextInt();

        System.out.println("Преобразованное число = " + Long.toString(inputNumber, outputSystem));
    }
}

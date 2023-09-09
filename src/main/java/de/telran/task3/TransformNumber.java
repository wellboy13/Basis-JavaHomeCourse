package de.telran.task3;

import java.util.Scanner;

public class TransformNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первоначальную систему счисления: ");
        int inNumbers = scanner.nextInt();

        System.out.print("Введите число: ");
        String inStr = scanner.next();
        long inStrNumber = Long.parseLong(inStr, inNumbers);

        System.out.print("В какую систему счисления преобразовать: ");
        int outNumbers = scanner.nextInt();

        System.out.println("Преобразованное число: " + Long.toString(inStrNumber, outNumbers));

    }
}
//    Переведите число 333 из 16-ричной в 10-ричную
//    Переведите число 819 из 10-ричной в 16-ричную
//    101101 в двоичной, переведите в 10-ричную
//    124 в десятичной, переведите в 2-ичную
package de.telran.homeWork_05_09;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово, которое состоит из четного количества букв: ");
        String firstWord = scanner.nextLine();

        System.out.print("Введите второе слово, которое состоит из четного количества букв: ");
        String secondWord = scanner.nextLine();

        int firstWordHalf = firstWord.length()/2;
        int secondWordHalf = firstWord.length()/2;

        System.out.println(firstWord.substring(0,firstWordHalf) + secondWord.substring(secondWordHalf));
    }
}

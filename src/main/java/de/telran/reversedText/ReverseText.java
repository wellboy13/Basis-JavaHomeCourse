package de.telran.reversedText;

import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //создаем сканер

        System.out.print("Введите текст: ");
        String normalText = scanner.nextLine(); //получаем текст

        String reversedText = ReverseMethodText.ReverseMethod(normalText); // отправляем текст в метод ReverseMethod

        System.out.println("Перевернутый текст: " + reversedText); //Печатаем перевернутый текст из метода
    }

}


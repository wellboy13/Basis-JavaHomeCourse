package de.telran.homeWork_05_09;

import java.util.Scanner;

public class Task5Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в евро: ");
        double inputEuro = scanner.nextDouble(); //получаем значение от пользователя

        double usdAmount = converter(inputEuro); // отправляем на конвертацию
        String cutUsdAmount = String.format("%.2f", usdAmount); // округляем значение до двух цифр после запятой


        System.out.println("Cумма в долларах США: " + cutUsdAmount); //печатаем результат

    }
    public static double converter(double inputEuro) {
        return  inputEuro / 1.12;
    }

}

//    Реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
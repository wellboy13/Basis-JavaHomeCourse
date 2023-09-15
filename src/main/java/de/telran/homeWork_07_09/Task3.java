package de.telran.homeWork_07_09;

import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        double temperature1; // декларируем переменную для первой колбы
        double temperature2; // декларируем переменную для второй колбы

        Scanner scannerTemp = new Scanner(System.in);
        Scanner scannerChoice = new Scanner(System.in);
        int i = 0;


        do {

            System.out.print("Введите значение для первой колбы ");
            temperature1 = scannerTemp.nextDouble();
            System.out.print("Введите значение для второй колбы ");
            temperature2 = scannerTemp.nextDouble();


            boolean checkTemp = checkTemperature(temperature1, temperature2); //отправляем данные в метод "checkTemperature"

            if (checkTemp) {
                System.out.println("Прибор работает"); //выводим результат о работе прибора
            } else {
                System.out.println("Прибор НЕ работает"); //выводим результат о НЕ рабочем приборе
            }

            i++;
            if (i == 3) break;

            System.out.print("Повторить ввод? (Y или N)");
            String userAnswer = scannerChoice.nextLine().toUpperCase();

            if (userAnswer.equals("N")) break;

        } while (true);
    }

    // метод проверки прибора
    public static boolean checkTemperature(double temp1, double temp2) {
        return temp1 > 100 && temp2 < 100; // возвращаем значение true или false
    }
}


//          Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура первой
//        колбы выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод, который
//        проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2.
//        В результате он выводит сообщение true или false.
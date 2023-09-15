package de.telran.homeWork_07_09;

public class Task3 {
    public static void main(String[] args) {

        double temperature1 = 102.2; // создаем переменную для первой колбы
        double temperature2 = 99.12; // создаем переменную для второй колбы

        boolean checkTemp = checkTemperature(temperature1, temperature2); //отправляем данные в метод "checkTemperature"

        System.out.println("Прибор работает: " + checkTemp); //выводим результат о работе прибора

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
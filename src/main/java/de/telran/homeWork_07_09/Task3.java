package de.telran.homeWork_07_09;

public class Task3 {
    public static void main(String[] args) {

        double Temperature1 = 102.2; // создаем переменную для первой колбы
        double Temperature2 = 102.12; // создаем переменную для второй колбы

        boolean checkTemp = checkTemperature(Temperature1, Temperature2); //отправляем данные в метод "checkTemperature"

        System.out.println("Прибор работает: " + checkTemp); //выводим результат о работе прибора

    }

    // метод проверки прибора
    public static boolean checkTemperature(double Temperature1, double Temperature2) {
        return Temperature1 > 100 && Temperature2 < 100; // возвращаем значение true или false
    }
}

//          Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура первой
//        колбы выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод, который
//        проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2.
//        В результате он выводит сообщение true или false.
package de.telran.homeWork_07_09;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите диаметр первой пиццы: ");
        int inDiameter1 = scanner.nextInt();
        System.out.print("Введите диаметр второй пиццы: ");
        int inDiameter2 = scanner.nextInt();

        //вычисляем площадь первой и второй пиццы с помощью метода pizzaAreaGet
        double areaPizza1 = pizzaAreaGet(inDiameter1);
        double areaPizza2 = pizzaAreaGet(inDiameter2);

        //Калории на 1 кв.см.
        int quadCallories = 40;

        //Выводим разницу в калориях
        if (inDiameter1 < inDiameter2) {
            int overCalories = (int) ((areaPizza2 - areaPizza1) * quadCallories);
            System.out.println("2 пицца калорийней первой на " + overCalories + " калорий");

        } else if (inDiameter2 < inDiameter1) {
            int overCalories = (int) ((areaPizza1 - areaPizza2) * quadCallories);
            System.out.println("1 пицца калорийней второй на " + overCalories + " калорий");

        } else System.out.println("Калорийность обеих пиц одинаковая");

    }

    public static double pizzaAreaGet(int diameter) { //считаем площадь пиццы
        double radius = (double) diameter / 2;
        return (Math.PI * radius) * radius;
    }
}

package de.telran.homeWork_31_08;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Calculator calc = new Calculator(); // создаем новый экземпляр класса "Calculator" - calc
        Scanner enter = new Scanner(System.in); // создаем новый экземпляр класса "Scanner" - enter


        System.out.print("Введите первое число: ");
        double x = enter.nextDouble(); // ждем ввод 1-го числа пользователем
        System.out.print("Введите второе число: ");
        double y = enter.nextDouble(); // ждем ввод 2-го числа пользователем


        // выводим результат
        System.out.println(x + " / " + y + " = " + calc.div(x, y));
        System.out.println(x + " - " + y + " = " + calc.sub(x, y));
        System.out.println(x + " + " + y + " = " + calc.sum(x, y));
        System.out.println(x + " * " + y + " = " + calc.mul(x, y));

        System.out.println(calc.sum(10, 5));
        System.out.println(calc.div(5, 14));
    }
}

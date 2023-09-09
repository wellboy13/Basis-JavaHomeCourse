package de.telran.homeWork_05_09;

public class Calculator {

    public double sum(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        if(y == 0) return 0; //если значение равно 0
        return x / y;
    }
}

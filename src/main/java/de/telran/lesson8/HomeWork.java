package de.telran.lesson8;

public class HomeWork {
    public static void main(String[] args) {
        int x = 25;
        int y = 180;
        int z = 25;

        int min;
        int mid;
        int max;

        if (x < y && y < z) {
            min = x;
            mid = y;
            max = z;
        } else if (x < z && z < y) {
            min = x;
            mid = z;
            max = y;
        } else if (y < x && x < z) {
            min = y;
            mid = x;
            max = z;
        } else if (y < z && z < x) {
            min = y;
            mid = z;
            max = x;
        } else if (z < x && x < y) {
            min = z;
            mid = x;
            max = y;
        } else {
            min = z;
            mid = y;
            max = x;
        }
        System.out.println("Выводим в порядке возрастания: " + min + " " + mid + " " + max);
        System.out.println("Выводим в порядке убывания: " + max + " " + mid + " " + min);
    }
}



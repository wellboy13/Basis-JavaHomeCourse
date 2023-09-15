package de.telran.homeWork_31_08;

public class Task1 {
    public static void main(String[] args) {


        String text = new String("I study Basic Java!"); // Создаем строку через new
        String method = Method(text); // передаем в метод строку I study Basic Java!

        //=================================
        System.out.println(text.length());
        System.out.println("Предпоследняя буква: " + text.charAt(text.length() - 2)); // предпоследний символ строки
        System.out.println("Содержит слово \"Java\"?: " + text.contains("Java")); // Проверяем, содержит ли ваша строка подстроку “Java”
        System.out.println(text.substring(14,18)); // Вырезаем строку Java c помощью метода String.substring()
        System.out.println(text.substring(0,14) + text.substring(18)); //
        System.out.println(text.replace("a","o")); // Меняем все символы “а” на “о”
        System.out.println(text.toUpperCase()); // Преобразуем строку к верхнему регистру
        System.out.println(text.toLowerCase()); // Преобразуем строку к нижнему регистру
    }

        public static String Method(String txt) { //метод, который обрабатывает текст и возвращает переменной text
            return txt + "!!";
    }
}

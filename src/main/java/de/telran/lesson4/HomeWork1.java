package de.telran.lesson4;

public class HomeWork1 {
    public static void main(String[] args) {
        String text = new String("I study Basic Java!");
        System.out.println(Method(text)); // вызов метода Method

        //=================================
        System.out.println(text.length());
        System.out.println("Предпоследняя буква: " + text.charAt(text.length() - 2));
        System.out.println("Содержит слово \"Java\"?: " + text.contains("Java"));
        System.out.println(text.substring(14,18));
        System.out.println(text.substring(0,14) + text.substring(18));
        System.out.println(text.replace("a","o"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }

        public static String Method(String txt) { //метод, который обрабатывает текст
            return txt + "!!";
    }
}

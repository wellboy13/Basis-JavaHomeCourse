package de.telran.lesson4;

public class HomeWork1 {
    public static void main(String[] args) {
        String text = new String("I study Basic Java!");
        stringTest(text);
        System.out.println("Предпоследняя буква: " + text.charAt(17));
        System.out.println("Содержит слово \"Java\"?: " + text.contains("Java"));
        System.out.println(text.substring(14,18));
        System.out.println(text.substring(0,14) + text.substring(18));
        System.out.println(text.replace("a","o"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }

        public static void stringTest(String txt) {
            System.out.println(txt);

    }
}

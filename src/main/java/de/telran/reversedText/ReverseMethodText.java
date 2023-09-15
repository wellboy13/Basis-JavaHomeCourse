package de.telran.reversedText;

public class ReverseMethodText {

    public static String ReverseMethod(String text) {

        int length = text.length(); //измеряем длину текста
        StringBuilder reversed = new StringBuilder(length); // создаем экземпляр класса StringBuilder

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(text.charAt(i)); //запускаем цикл для обратной печати с большего значения к меньшему
        }
        return reversed.toString(); //возвращаем текст в main
    }
}

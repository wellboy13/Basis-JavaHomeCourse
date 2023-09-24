package de.telran.homeWork_14_09;

public class BankApp {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(654376, "John");

        int moneyInDay;
        int countDay = 0;
        

        while (account1.balance > 0) {
            countDay++;

            moneyInDay = account1.giveMeMaxMoney();
            System.out.println(countDay + " Снято " + moneyInDay + ", осталось = " + account1.balance);
        }

        String days = getDaysRejection(countDay);

        System.out.println("Всего " + countDay + days);
    }

    public static String getDaysRejection(int count) {
        String days = "" + count;
        String word;

        if (days.length() > 1) days = days.substring(days.length() - 2);
        int n = Integer.decode(days);

        if (n > 20) {
            n = n % 10;
        }
        if (n == 1) {
            word = " день";
        } else if (n > 1 && n < 5) {
            word = " дня";
        } else {
            word = " дней";
        }
        return word;
    }
}





package de.telran.homeWork_07_09;

public class Task2 {
    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);

        // 1-ый вариант с true или false

        System.out.println("Я могу купить еду, это " + canBuy);

        //2-ой вариант с условием

        if (canBuy) {
            System.out.println("Я могу купить еду, магазины работают");
        } else {
            System.out.println("Я не смогу купить еду, все магазины закрыты");
        }

    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}

//Создайте две переменные isEdekaOpen и isReweOpen,значения которых зависят от того,открыты магазины или нет
//        (значения задайте сами).Реализуйте логический метод canBuy,возвращающий true/false Значение этой переменной
//      должно быть true,если хотя бы один магазин открыт,иначе false.Отобразите строку «Я могу купить еду,это ……» и значение.
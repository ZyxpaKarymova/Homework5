package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS");
        } else {
            System.out.println("Установите версию приложения для Android");
        }

        System.out.println("Задача 2");
        int yearPhone = 2013;
        String os = clientOS == 0 ? "iOs" : "Android";
        String version = yearPhone > 2015 ? "" : " облегченную";
        System.out.println("Установите" + version + " версию приложения для " + os + " по ссылке");

        System.out.println("Задача 3");
        int year = 1900;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 45;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if ((deliveryDistance > 20) && (deliveryDistance <= 60)) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if ((deliveryDistance > 60) && (deliveryDistance <= 100)) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача 5");
        int month = 14;
        switch (month) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет ");
        }

    }

}
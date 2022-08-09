public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 8;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Приложения для Вашей операционной системы нет =(");
        }

        // Задание 2
        int clientOpS = 1;
        int clientDeviceYear = 2016;
        if (clientOpS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else  if (clientOpS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }if (clientOpS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOpS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Задание 3
        int year = 1900;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( year + " год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }

        // Задание 4
        int deliveryDistance = 15;
        int deliveryDays = 1;
        int interval = 40;
        int startinterval =20;
        if (deliveryDistance <= startinterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startinterval) / (double) interval);
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        // Задание 5
        int monthNumber = 14;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Данный месяц принадлежит к сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Данный месяц принадлежит к сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Данный месяц принадлежит к сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Данный месяц принадлежит к сезону Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }
}
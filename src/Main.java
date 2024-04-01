import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение! 0 - IOS, 1 - Android");
        byte clientOS = sc.nextByte();
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("У нас нет предложений для Вас");
        }
        //Задача 2
        System.out.println("Введите год выпуска вашего устройства");
        short clientDeviceYear = sc.nextShort();
        if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("У нас нет предложений для Вас");
        }
        //Задача 3
        System.out.println("Введите год");
        int year = sc.nextInt();
        if (year >= 1584) {
            if (year % 400 == 0 && year % 4 == 0 || year % 4 == 0 && !(year % 100 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Григорианский календарь приняли только в 1584 году");
        }
        //Задача 4
        System.out.println("Укажите расстояние");
        short deliveryDistance = sc.nextShort();
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки свыше 100 км нет");
        }
        //Задача 5
        System.out.println("Укажите номер месяца");
        byte monthNumber = sc.nextByte();
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Указан невалидный месяц");
        }
        sc.close();
    }

}

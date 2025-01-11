import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
        task3();


    }

    public static void task1() {
        int year = 2024;
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeapYear;
    }


    public static void task2() {
//        Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
//        Если устройство старше текущего года, предложите ему установить облегченную версию.
//        Текущий год можно получить таким способом:
//        int currentYear = LocalDate.now().getYear();
//        Или самим задать значение вручную — ввести в переменную числовое значение.
//        В результате программа должна выводить в консоль сообщение, какую версию приложения (
//        обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.

        suggestAppVersion(1, 2025);

    }
    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        final int IOS = 0;
        final int ANDROID = 1;
        if (clientOS == IOS) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Вот ссылка на стандартное приложение на iOS");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == ANDROID) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Вот ссылка на стандартное приложение на Android");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Неизвестная операционная система");
        }
    }


    public static void task3() {
//        Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает
//        итоговое количество дней доставки.
        calculationOfDeliveryDays(40);
    }

    public static void calculationOfDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("На доставку потребуется дней: '1'");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("На доставку потребуется дней: '2'");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("На доставку потребуется дней: '3'");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставка не осуществляется");
        }

    }


}
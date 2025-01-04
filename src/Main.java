import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        taks1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
        task10();
    }
    public static void taks1() {
//С помощью цикла for выведите в консоль все числа от 1 до 10.
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
//        С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
//        Выведите в консоль все четные числа от 0 до 17.
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
//        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        for (int i = -10; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task5() {
//        Напишите программу, которая выводит в консоль все високосные года,
//        начиная с 1904 года до 2096. В консоль результат должен выводиться в
//        формате: «… год является високосным».
        for (int leapYear = 1904; leapYear <= 2096; leapYear = leapYear+ 4) {
            System.out.println(leapYear);
        }
    }

    public static void task6() {
//        Напишите программу, которая выводит в консоль последовательность чисел:
//        7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
//        Напишите программу, которая выводит в консоль последовательность чисел:
//        1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
//        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать
//        по 29 000 рублей «в банку».
//        Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
    int saveMoney = 29000;
    int total = 0;
    for (int i = 1; i <= 12; i++) {
        total = total + saveMoney;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
    }

    }

    public static void task9() {
//        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку»,
//        а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль
//        в формате: «Месяц …, сумма накоплений равна … рублей».
        int saveMoney = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + saveMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");

        }
    }

    public static void task10() {
//        Напишите программу, которая выводит в консоль таблицу умножения на 2:
//        2*1=2
//        2*2=4
//        2*3=6
//        2*4=8
//        2*5=10
//        2*6=12
//        2*7=14
//        2*8=16
//        2*9=18
//        2*10=20
        int two = 2;
        for (int i = 1; i <= 10; i++) {
            int total = two * i;
            System.out.println(two + "*" + i + "=" + total);
        }
    }





}


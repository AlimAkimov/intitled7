import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        taks1();
//        task2();
        task3();


    }

    public static void taks1() {
//        Объявите три массива:
//        Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
//        Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
//        Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите
//        способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        int[] oneTwoThree = new int [] {1, 2, 3};
        double [] fractionalNumber = {1.57, 7.654, 9.986};
        String [] arbitraryArray = {"что-то", "Где-то", "Потому что", "камень", "дерево", "булыжник"};
        // Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        for (int i = 0; i < 3; i++)
        if (i == oneTwoThree.length - 1) {
            System.out.print(oneTwoThree[i] + ".");
        } else {
            System.out.print(oneTwoThree[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < fractionalNumber.length; i++)
        if (i == fractionalNumber.length - 1) {
            System.out.print(fractionalNumber[i] + ".");
        } else {
            System.out.print(fractionalNumber[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < arbitraryArray.length; i++)
        if (i == arbitraryArray.length - 1) {
            System.out.print(arbitraryArray[i] + ".");
        } else {
            System.out.print(arbitraryArray[i] + ", ");
        }
        }

    public static void task2() {
//        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
//                Если в задаче № 2 в консоль у вас вывелся результат:
//        1, 2, 3
//        1.57, 7.654, 9.986
// произвольные элементы третьего массива
//        то в этой задаче результат должен быть таким:
//        3, 2, 1
//        9.986, 7.654, 1.57
// произвольные элементы третьего массива в обратном порядке
        int[] oneTwoThree = new int [] {1, 2, 3};
        double [] fractionalNumber = {1.57, 7.654, 9.986};
        String [] arbitraryArray = {"что-то", "Где-то", "Потому что", "камень", "дерево", "булыжник"};

        for (int i = oneTwoThree.length -1; i >= 0; i--)
        if (i == 0) {
            System.out.print(oneTwoThree[i] + ".");
        } else {
            System.out.print(oneTwoThree[i] + ", ");
        }
        System.out.println();

        for (int i = fractionalNumber.length -1; i >= 0; i--)
        if (i == 0) {
            System.out.print(fractionalNumber[i] + ".");
        } else {
            System.out.print(fractionalNumber[i] + ", ");
        }
        System.out.println();

        for (int i = arbitraryArray.length - 1; i >= 0; i--)
            if (i == 0) {
                System.out.print(arbitraryArray[i] + ".");
            } else {
                System.out.print(arbitraryArray[i] + ", ");
            }
    }
    public static void task3() {
//        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
//        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
//        Распечатайте результат преобразования в консоль.

        int[] oneTwoThree = new int [] {1, 2, 3};
        for (int i = 0; i < oneTwoThree.length; i++ ) {
            int number = oneTwoThree[i];
            if (number % 2 != 0) {
            number = number + 1;
                System.out.print(number + " ");
            } else {
                System.out.print(number + " ");
            }
        }

    }


}



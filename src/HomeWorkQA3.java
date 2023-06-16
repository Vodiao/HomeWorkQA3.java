

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class HomeWorkQA3 {
    static public Scanner sc = new Scanner(System.in);
    static public Random random = new Random();

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task3PartSecond();
        //task4();
        optionalTask1();

    }

    static public void task1() {
        System.out.println("Enter the size of the array:");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    static public void task2() {
        for (int i = 10; i >= 1; --i) {
            for (int j = 10; j >= 1; --j) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    static public void task3() {
        System.out.println("Guess the word stopping the program:");
        System.out.println("stop, bye, hello, arrivederci ");
        boolean condition = true;
        while (condition) {
            if (sc.nextLine().equals("stop")) {
                break;
            }
        }
        System.out.println("You guessed the word!!!");

    }

    static public void task3PartSecond() {
        int sum = 0;
        int count = 0;
        int number;
        do {
            System.out.println("Введите числа чтобы была ровна 100");
            number = sc.nextInt();
            sum += number;
            count++;
        } while (sum <= 100);
        System.out.println("Количество введенных чисел: " + count);
    }

    static public void task4() {
        int[][] array = new int[4][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
    //Optional tasks

    /**
     * Используя вложенные циклы for найдите минимальное число в массиве.
     * (Подсказка - создайте переменную с очень большим числом и сравнивайте значение из массива с этим большим числом,
     * если число из массива меньше = присваивайте новое)
     */
    public static void optionalTask1() {
        Integer min = MAX_VALUE;
        int[] array = {1000, -12, -2, 3, -13};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum number in array:" +  min);
    }


}

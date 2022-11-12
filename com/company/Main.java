package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        //Задание 2
        int sum = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            sum = sum + generateRandomArray()[i];


        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Минимальная сумма трат за день составила " + min(generateRandomArray()) + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max(generateRandomArray()) + "  рублей");

//Задание 3
        float sumMonths = 0f;
        sumMonths = sum / generateRandomArray().length;
        System.out.println("Средняя сумма трат за месяц составила " + sumMonths +  " рублей");

//задание4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int n = reverseFullName.length;
        for (int i = 0; i < n /2;  i++) {
            int tmp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = (char) tmp;
        }
        System.out.println();

        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }

        // исправлено
        System.out.println();
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
//Генерим массив
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
    }
// Задание 2
    public static int min (int[] ints){
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            min = Math.min(min, ints[i] );
        }
        return  min;

    }

    public static int max (int[] ints) {
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            max = Math.max(max, ints[i]);

        }
        return max;
    }






}





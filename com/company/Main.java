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


        System.out.println(getReverseFullName());


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



// Задание 4
    public static char[] getReverseFullName () {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length + 1; i >= 0; i++) {
         //   System.out.print(reverseFullName[i]);
        }
        String str = new String(reverseFullName);


        return reverseFullName;
    }
}





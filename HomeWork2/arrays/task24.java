package HomeWork2.arrays;

import HomeWork2.Utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class task24 {

    public static void main(String[] args) {


        System.out.println("Сумма четных: " + SumOfEven(ArraysUtils.arrayRandom(50, 100)));
        System.out.println("Максимальный из элементов массива с четными: " + MaximumElement(ArraysUtils.arrayRandom(50, 100)));
        System.out.println("Элементы массива, меньше среднего арифметического: " + LessThanAverage(ArraysUtils.arrayRandom(50, 100)));
        System.out.println("Два наименьших элемента массива: " + MinimumElements(ArraysUtils.arrayRandom(50, 100)));
        System.out.println("После удаления элементов: " + Сompression(ArraysUtils.arrayRandom(50, 100)));
        System.out.println("Сумма цифр массива: " + SumOfDigits(ArraysUtils.arrayRandom(50, 100)));

    }

    public static int SumOfEven(int[] array) {

        int x = 0;

        for (int i : array) {

            if (i % 2 == 0) {
                x = x+i;
            }
        }
        return x;
    }

       public static int MaximumElement(int[] array) {

        int x = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0 && i != 0) {

                if (array[i] > x) {
                    x = array[i];
                }
            }
        }
        return x;
    }

        public static String LessThanAverage(int[] array) {

            String a = "";
            int x = 0;
            int y = 0;

            for (int i = 0; i < array.length; i++) {
                x = x + array[i];
            }

            y = x / array.length;

            for (int i = 0; i < array.length; i++) {
                if (array[i] < y) {
                    a = a + array[i] + " ";
                }
            }
            return a;
    }

        public static String MinimumElements(int[] array) {

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;

        for (int j : array) {

            if (j < a) {
                b = a;
                a = j;
            }
        }
        String c = " " + a + " " + b;
        return c;
    }
    public static String Сompression(int[] array) {

        int a = 32;
        int b = 77;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > a && array[i] < b) {
                array[i] = 0;
            }
        }
        String k=Arrays.toString(array);
        return k;

    }

       public static int SumOfDigits(int[] array) {

        int x = 0;

        for(int i=0; i<array.length; i++){

            int y = array[i];

            while (y >0) {

                x = x + y % 10;
                y = y / 10;
            }
        }
        return x;
    }
}

package HomeWork2.Utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

                public static int[] arrayFromConsole() {

                    Scanner in = new Scanner(System.in);

                    System.out.println("Введите размер массива");

                    int size = in.nextInt();

                    int[] array = new int[size];

                    System.out.println("Заполните массив");

                    for (int i = 0; i < array.length; i++) {

                        array[i] = in.nextInt();
                }
                return array;
            }

            public static int[] arrayRandom(int size, int maxValueExclusion){

                    int[] array = new int[size];

                    Random a = new Random();

            for (int i = 0; i < array.length; i++){

                array[i] = a.nextInt(maxValueExclusion + 1);

            }

            return array;
        }
    }


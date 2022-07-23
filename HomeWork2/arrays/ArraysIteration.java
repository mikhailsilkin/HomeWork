package HomeWork2.arrays;

import HomeWork2.Utils.ArraysUtils;

public class ArraysIteration {

    public static void main(String[] args) {
        System.out.println("For");
        System.out.println(ArrayFor());
        System.out.println();

        System.out.println("DoWhile");
        System.out.println(ArrayDoWhile());
        System.out.println();

        System.out.println("While");
        System.out.println(ArrayWhile());
        System.out.println();

        System.out.println("Foreach");
        System.out.println(ArrayForeach());
        System.out.println();


        System.out.println("For");
        System.out.println(ArrayFor2());
        System.out.println();

        System.out.println("DoWhile");
        System.out.println(ArrayDoWhile2());
        System.out.println();

        System.out.println("While");
        System.out.println(ArrayWhile2());
        System.out.println();

        System.out.println("Foreach");
        System.out.println(ArrayForeach2());
        System.out.println();


        System.out.println("For");
        System.out.println(ArrayReverseFor());
        System.out.println();

        System.out.println("DoWhile");
        System.out.println(ArrayReverseDoWhile());
        System.out.println();

        System.out.println("While");
        System.out.println(ArrayReverseWhile());
        System.out.println();

        System.out.println("Foreach");
        System.out.println(ArrayReverseForeach());
        System.out.println();

    }


    public static int[] ArrayFor() {

        int[]array = ArraysUtils.arrayFromConsole();

        for (int i = 0; i<array.length; i++) {

            System.out.print(array[i]+ " ");
        }
        return array;
    }


    public static int[] ArrayDoWhile() {

        int[]array = ArraysUtils.arrayFromConsole();
        int i = 0;

        do {
            System.out.print(array[i]+ " ");
            i++;
        }
        while (i<array.length);
        return array;
    }


    public static int[] ArrayWhile() {

        int[]array = ArraysUtils.arrayFromConsole();
        int i = 0;

        while (i<array.length){

            System.out.print(array[i]+ " ");
            i++;
        }
        return array;
    }


    public static int[] ArrayForeach() {

        int[]array = ArraysUtils.arrayFromConsole();

        for (int element:array) {

            System.out.print(element + " ");
        }
        return array;
    }



    public static int[] ArrayFor2(){

        int[]array = ArraysUtils.arrayFromConsole();

        for (int i = 1; i<array.length; i=i+2) {

            System.out.print(array[i] + " ");
        }
        return array;
    }


    public static int[] ArrayDoWhile2(){

        int[]array = ArraysUtils.arrayFromConsole();
        int i = 1;

        do {
            System.out.print(array[i] + " ");
            i=i + 2;
        }
        while (i<array.length);
        return array;
    }



    public static int[] ArrayWhile2(){

        int[]array = ArraysUtils.arrayFromConsole();
        int i = 1;

        while (i<array.length){

            System.out.print(array[i] + " ");
            i=i + 2;
        }
        return array;
    }




    public static int[] ArrayForeach2(){

        int[]array = ArraysUtils.arrayFromConsole();
        int x = 1;

        for (int element:array){
            if (x % 2 == 0) {
                System.out.print(element + " ");
            }
            x++;
        }
        return array;
    }



    public static int[] ArrayReverseFor(){

        int[]array = ArraysUtils.arrayFromConsole();

        for (int i = array.length-1; i>=0; i--) {

            System.out.print(array[i] + " ");
        }
        return array;
    }



    public static int[] ArrayReverseDoWhile(){

        int[]array = ArraysUtils.arrayFromConsole();
        int i = array.length-1;

        do {

            System.out.print(array[i] + " ");

            i--;
        }
        while (i>=0);
        return array;
    }



    public static int[] ArrayReverseWhile() {

        int[] array = ArraysUtils.arrayFromConsole();
        int i = array.length - 1;

        while (i >= 0) {

            System.out.print(array[i] + " ");

            i--;
        }
        return array;
    }




    public static int[] ArrayReverseForeach() {

        int[] array = ArraysUtils.arrayFromConsole();
        int[] arrayFinal = new int[array.length];
        int i = array.length - 1;

        for (int element : array) {

            arrayFinal[i] = element;

            i--;
        }
        for (int element : arrayFinal) {
            System.out.print(element + " ");
        }
        return array;
    }

}

package HomeWork2.loops;

import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число : ");


        if (in.hasNextInt()) {
            int a = in.nextInt();
            int b = 1;
            int i;
            for ( i = 1; i < a; i++) {
                System.out.print(i + " * ");
                b = b * (a % 10);

                a = a / 10;

            }
            System.out.print(i + " = " + b);

        } else if (in.hasNextDouble()) {

            System.out.printf("Это не целое число");

        } else if (in.hasNextLine()) {

            System.out.printf("Это не число");

        }
    }
}

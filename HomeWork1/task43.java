package HomeWork1;

import java.util.Scanner;

public class task43 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите 2 числа: ");

        int a = in.nextInt();

        int b = in.nextInt();

        if (a%b == 0) {

                System.out.println("Числа делятся без остатка");

        }   else {

                System.out.println("Числа делятся с остатком");
        }
    }
}

package HomeWork1;

import java.util.Scanner;

public class task42 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ведете 3 числа: ");

        int a = in.nextInt();

        int b = in.nextInt();

        int c = in.nextInt();

        if (a < b && a > c) {

            System.out.println(a);

        } else if (b < a && b > c) {

            System.out.println(b);

        } else {

            System.out.println(c);
        }
    }

}










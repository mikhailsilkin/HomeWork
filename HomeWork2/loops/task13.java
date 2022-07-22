package HomeWork2.loops;

import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Введите возводимое число : ");

        double a = in.nextDouble();

        System.out.println("Введите степень : ");

        double b = in.nextDouble();

        double c =1;

        for (double d = 0; d < b; d++) {

            c=c*a;
        }
System.out.println(a + "^" +b+ "=" + c);
    }
}


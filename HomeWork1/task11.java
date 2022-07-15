package HomeWork1;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число 1: ");

        int a = in.nextInt();  // a взял 42 , в двоичной 0010 1010

        System.out.println("Введите число 2: ");

        int b = in.nextInt();  // b взял 24 , в двоичной 0001 1000

        System.out.println(a & b);  // результат 8 или 0000 1000

        System.out.println(a | b);  // результат 58 или 0011 1010

    }
}

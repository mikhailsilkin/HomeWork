package HomeWork1;

import java.util.Scanner;

    public class task41 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.println("Введите число: ");

            int a = in.nextInt();

            if (a % 2 == 0) {

                System.out.println("Число четное");

            }   else {

                System.out.println("Число не четное");

            }

        }
}

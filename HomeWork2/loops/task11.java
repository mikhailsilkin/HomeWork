package HomeWork2.loops;

import java.util.Scanner;

    public class task11 {

        public static void main(String[] args) {


            Scanner in = new Scanner(System.in);

            System.out.println("Введите число : ");

            int a = in.nextInt();

            long b = 1;

            for (int i = 1; i <= a; i++) {
                b = b * i;
                if (b==1) {
                    System.out.print(1);
                }
                else {
                    System.out.print(" * " + i);
                }

                if (b < 0) {
                    System.out.println(" Произошло переполнение");
                    break;
                }

            }
            if (b > 0) {


                System.out.print(" = " + b);
            }
        }
    }


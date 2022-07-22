package HomeWork2.loops;

import java.util.Scanner;

public class task14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите  число: ");
        int a = in.nextInt();

        long b = 1;
        long c = 0;
        for (int i = a; ; ) {
            b = b*i;
            if (b < 0) {
                System.out.println("переполнение");
                System.out.println("до переполнения " + c);
                break;
            }
            c = b;

        }
        System.out.println("после переполнения " +b);
    }
}
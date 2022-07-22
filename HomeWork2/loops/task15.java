package HomeWork2.loops;

import java.util.Scanner;
import java.util.Random;
public class task15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Процент четных случайного числа - " + probability() + "%");
        System.out.println("Введите число для 1 задания: ");
        int n = in.nextInt();
        System.out.println("Максимальная цифра в введенном числе " + max(n));

        EvenOdd();
        fibo();
        numbers();
        coup();
    }

    public static int max(int n) {
        int a, m = 0;
        while (n > 0) {
            a = (int) n % 10;
            if (a > m) m = a;
            n /= 10;
        }
        return m;
    }

    public static int probability() {


        int q = 0;

        for (int i = 0; i < 1000; i++) {

            if ((int) (Math.random()*100) % 2 == 0) {

                q=q+1;

            }

        }
        int c= q*100/1000;

        return c;
    }

    public static int EvenOdd() {

        int a = 0;
        int b = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число для 3 задания: ");

        int x = in.nextInt();
        while (x > 0) {

            if (x % 2 == 0)
            {
                a++;
            } else b++;
            x /= 10;
        }
        System.out.println("Четные: " + a + " Нечетные: " + b);
        return 0;
    }

    public static int fibo() {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число для 4 задания: ");

        int a = in.nextInt();


        int b = 1;
        int c = 1;
        int d;
        System.out.println("Ряд фибоначчи: ");
        System.out.print(" " + c + " ");
        for (int i = 3; i <= a + 1; i++) {
            d = b + c;
            System.out.print(d + " ");
            b = c;
            c = d;

        }
        System.out.println();
        return 0;
    }

    public static int numbers() {
        int a = 0;
        String b = "0";
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число для 5 задания: ");

        int c = in.nextInt();

        System.out.println("Введите шаг");

        int i = in.nextInt();
        int d = a;

        while (d < c) {
            d = d+i;
            b = b + " " + d;
        }
        System.out.println(b);
        return 0;
    }
    public static int coup() {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число для 6 задания: ");

        int a = in.nextInt();

        int  reversed = 0;

        while(a != 0) {

            int b = a % 10;
            reversed = reversed * 10 + b;

            a /= 10;
        }

        System.out.println("Это число наоборот: " + reversed);
        return 0;
    }

}




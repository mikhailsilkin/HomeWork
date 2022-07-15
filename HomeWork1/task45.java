package HomeWork1;

import java.util.Scanner;

public class task45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код символа");
        int a = scanner.nextInt();
        char b = (char) a;

        if (a > 64 & a < 91) {

            System.out.println(b + " - Это буква латинского алфавита");

        } else if (a > 96 & a < 123) {

            System.out.println(b + " - Это буква латинского алфавита");

        } else {

            System.out.println(b + " - Это не буква Англиского алфавита");
        }
    }
}

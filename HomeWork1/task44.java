package HomeWork1;

import java.util.Scanner;

import java.util.Scanner;

public class task44 {

    public static void main(String[] args) {

        System.out.println("Введите число: ");

        int a = new Scanner(System.in).nextInt();

        System.out.println("Выберите и введите перевести в байты (b) или в килобайты (k)?" );

        String b = new Scanner(System.in).nextLine();

        if (b.length() == 1) {

            if (b.charAt(0) == 'b') {

                System.out.println("b = " + (a * 1024));

            } else if (b.charAt(0) == 'k') {

                System.out.println("k = " + (a / 1024));

            } else {

                System.out.println("читайте внимательно какие буквы можно вводить (b(байты) или к(килобайты))");
            }

        } else {

                System.out.println("Введите только одну букву ");
        }
    }
}



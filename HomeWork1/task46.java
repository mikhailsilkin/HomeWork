package HomeWork1;

import java.util.Scanner;

public class task46 {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Введите год: ");

        int year = in.nextInt();

        if(year % 4 == 0 && year % 100 != 0 ||year % 400 == 0) {

                System.out.println(year + "Год високосный!");

        }   else {

                System.out.println(year + "Год не високосный!");
        }
    }

}

package HomeWork1;

import java.util.Scanner;

public class task51 {

    public static boolean sleepIn(boolean weekday, boolean vacation) {

       if (!weekday || vacation) {

          return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Сегодня рабочий день? (true/false) ");

        boolean weekday = in.nextBoolean();

        System.out.println("У вас отпуск ? (true/false) ");

        boolean vacation = in.nextBoolean();

        if (sleepIn(weekday, vacation)) {
           System.out.println("выходной");
        } else {
            System.out.println("рабочий день");
        }

    }
}
package HomeWork1;

public class task31 {

    public static void main(String args[]) {

        double  x , y , z, a, b;

        y = 3;
        x = 4;


        z = Math.random() ;                         // генерация случайного числа
        System.out.println("z =  "  + z);

        b = Math.sqrt(x);                           //кубический корень
        System.out.println("b = " + b);

        a = Math.max(x, y) ;                             //максимальное число
        System.out.println("a =  "  + a);

        a = Math.pow(x, y);                         // возведение в степень
        System.out.println("a =  "  + a);

        System.out.println(Math.floor(x + 1.5));    // округление в меньшую сторону

        System.out.println(Math.ceil(x + 1.1));     // округление в большую сторону

        System.out.println(Math.round(x + 1.5));   // округление по математическим правилам

        System.out.println(Math.cos(Math.toRadians(90)));  // вычисление косинуса от 90

        System.out.println(Math.abs(-x));       //  по модулю


    }

    }
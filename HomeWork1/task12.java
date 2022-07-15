package HomeWork1;

public class task12 {

    public static void main(String[] args) {

        double x = 42.5;

        System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(x)));  // 100000001000101010000000000000000000000000000000000000000000000
        System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(-x))); // 1100000001000101010000000000000000000000000000000000000000000000
    }
}

package cycles;

public class Task4 {
    public static void main(String[] args) {
        int number = 200;
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= Math.pow(i, 2);
        }
        System.out.println("Произведения квадратов первых двухсот чисел = " + result);
    }
}

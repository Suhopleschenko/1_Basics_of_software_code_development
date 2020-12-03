package cycles;

public class Task2 {
    public static void main(String[] args) {
        int number = 100;
        int i;
        int result = 0;
        for (i = 1; i <= number; i++) {
            result += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов первых ста чисел = " + result);
    }
}

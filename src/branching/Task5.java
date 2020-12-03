package branching;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите X:");
        double x = scanner.nextDouble();
        if (x <= 3) {
            double result1 = Math.pow(x, 2) - 3 * x + 9;
            System.out.println("Значение функции = " + result1);
        } else {
            double result2 = 1 / (Math.pow(x, 3) + 6);
            System.out.println("Значение функции = " + result2);
        }
        scanner.close();
    }
}
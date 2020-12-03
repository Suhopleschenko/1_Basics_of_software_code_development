package branching;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры прямоугольного отверстия A, B:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Введите размеры кирпича X, Y, Z:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        if (a >= x && b >= y || a >= x && b >= z) {
            System.out.println("Кирпич проходит");
        } else if (a >= y && b >= x || a >= y && b >= z) {
            System.out.println("Кирпич проходит");
        } else if (a >= z && b >= x || a >= z && b >= y) {
            System.out.println("Кирпич проходит");
        } else {
            System.out.println("Кирпич не проходит");
        }
        scanner.close();
    }
}

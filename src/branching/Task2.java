package branching;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        System.out.println("Введите число c:");
        int c = scanner.nextInt();
        System.out.println("Введите число d:");
        int d = scanner.nextInt();
        if (a < b) {
            if (c < d) {
                System.out.println(a > c ? "Максимум из минимумов число: " + a : "Максимум из минимумов число: " + c);
            } else if (d < c) {
                System.out.println(a > d ? "Максимум из минимумов число: " + a : "Максимум из минимумов число: " + d);
            }
        } else if (b < a) {
            if (c < d) {
                System.out.println(b > c ? "Максимум из минимумов число: " + b : "Максимум из минимумов число: " + c);
            } else if (d < c) {
                System.out.println(b > d ? "Максимум из минимумов число: " + b : "Максимум из минимумов число: " + d);
            }
        }
        scanner.close();
    }
}
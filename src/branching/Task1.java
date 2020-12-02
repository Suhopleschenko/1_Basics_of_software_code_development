package branching;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите первый угол в градусах:");
        int a = scan.nextInt();
        System.out.println("Ведите второй угол в градусах:");
        int b = scan.nextInt();
        if (a + b < 180 && a > 0 && b > 0) {
            System.out.println("Треугольник существует");
            if (a == 90 || b == 90 || a + b == 90) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
        scan.close();
    }
}

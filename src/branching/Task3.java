package branching;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой точки X1, Y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Введите координаты второй точки X2, Y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("Введите координаты третьей точки X3, Y3: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
        scanner.close();
    }
}

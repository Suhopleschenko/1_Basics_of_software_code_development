package linearprograms;

import java.util.Scanner;

import static java.lang.StrictMath.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a: ");
        double a = scan.nextDouble();
        System.out.println("Введите b: ");
        double b = scan.nextDouble();
        System.out.println("Введите c: ");
        double c = scan.nextDouble();
        double z = ((b + sqrt(pow(b, 2) + 4 * a * c)) / 2 / a) - (pow(a, 3) * c) + pow(b, -2);
        System.out.println("Значение выражения = " + z);
        scan.close();
    }
}
package linearprograms;

import java.util.Scanner;

import static java.lang.Math.*;


public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите X: ");
        double n = scan.nextDouble();
        double x = toRadians(n);
        System.out.println("Введите Y: ");
        double m = scan.nextDouble();
        double y = toRadians(m);
        double a = toRadians(n * m);
        double rez = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(a);
        String result = String.format("%.3f", rez);
        System.out.println(result);
        scan.close();
    }
}
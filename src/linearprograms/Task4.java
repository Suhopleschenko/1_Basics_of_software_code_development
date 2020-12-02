package linearprograms;

import java.util.Scanner;

import static java.lang.Math.round;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число вида nnn.ddd: ");
        double a = scan.nextDouble();
        double b = round(a);
        double c = round((a - b) * 1000);
        double d = c + b / 1000;
        System.out.println("Ваше измененное число: " + d);
        scan.close();
    }
}

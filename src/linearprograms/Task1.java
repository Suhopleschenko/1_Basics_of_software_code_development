package linearprograms;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите а: ");
        double a = scan.nextDouble();
        System.out.println("Введите b: ");
        double b = scan.nextDouble();
        System.out.println("Введите c: ");
        double c = scan.nextDouble();
        double z = ((a-3)*b/2)+c;
        System.out.println("Значение функции = "+z);
        scan.close();
    }
}

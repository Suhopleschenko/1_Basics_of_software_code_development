package linearprograms;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты X и Y: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        boolean result = x >= -2 && x <= 2 && y >= 0 && y <= 4 || x >= -4 && x <= 4 && y >= -3 && y <= 0;
        System.out.println(result ? "true" : "false");
        scan.close();
    }
}
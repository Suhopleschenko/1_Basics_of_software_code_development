package linearprograms;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число секунд: ");
        int a = scan.nextInt();
        int hours = a / 3600;
        int c = a - hours * 3600;
        int minutes = c / 60;
        int seconds = c - minutes * 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с ");
        scan.close();
    }
}

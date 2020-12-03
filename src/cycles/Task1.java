package cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Error");
        } else {
            int result = 0;
            for (int i = 1; i < number; i++) {
                result += i;
            }
            System.out.println("Сумма чисел от 1 до введенного вами числа = " + result);
        }
        scanner.close();
    }
}

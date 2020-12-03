package cycles;

public class Task2v {
    public static void main(String[] args) {
        int a = -10;
        int b = 5;
        int step = 2;
        int y;
        System.out.println("Значения функции на отрезке [" + a + ", " + b + "] с шагом " + step + ":");
        for (int x = a; x <= b; ) {
            if (x <= 2) {
                y = -x;
                System.out.println(y);
                x += step;
            } else {
                y = x;
                System.out.println(y);
                x += step;
            }
        }
    }
}


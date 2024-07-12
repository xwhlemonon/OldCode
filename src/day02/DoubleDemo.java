package day02;

import java.util.Scanner;

public class DoubleDemo {
    public static void main(String[] args) {
        double a = 3.14;
        float b = 3.14F;
        double c = 3.0, d = 2.9;
        System.out.println(c-d);
        double e = 6.0, f = 4.9;
        System.out.println(e-f);
        double g = 6.0, h = 1.9;
        System.out.println(g-h);

        Scanner scanner = new Scanner(System.in);
        int arr[] = {0, 0, 0};
        for (int j = 0; j <= 2; j++){
            arr[j] = scanner.nextInt();
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println(arr[i]);
        }
    }
}

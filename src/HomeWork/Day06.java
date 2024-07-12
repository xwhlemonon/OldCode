package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day06 {
    public static void main(String[] args) {
        say();
        say(1);
        say(1, 1);
        sum(15, 15);
        int[] arr = generateArray();
        compere();
        game();
    }

    public static void say() {
        System.out.println("Hello.");
    }

    public static void say(int temp) {
        System.out.println("Hello.");
    }

    public static void say(int temp_1, int temp_2) {
        System.out.println("Hello.");
    }

    public static int sum(int temp_1, int temp_2) {
        return temp_1 + temp_2;
    }

    public static int[] generateArray() {
        Random random = new Random();
        int[] arr = new int[random.nextInt(10) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        return arr;
    }

    public static void compere() {
        int[] cares = cares();
        int[] caresArr = caresArr(cares);
        int num = avg(caresArr);
        System.out.println(num);
    }

    public static int[] cares() {
        Random random = new Random();
        int size = random.nextInt(21) + 10;
        int[] cares = new int[size];
        for (int i = 0; i < cares.length; i++) {
            cares[i] = random.nextInt(101);
        }
        return cares;
    }

    public static int[] caresArr(int[] arr) {
        Arrays.sort(arr);
        int[] temp = Arrays.copyOf(arr, arr.length - 1);
        int[] temp_2 = new int[arr.length - 2];
        System.arraycopy(temp, 1, temp_2, 0, arr.length - 2);
        return temp_2;
    }

    public static int avg(int[] arr) {
        int sub = 0;
        for (int x : arr) {
            sub += x;
        }
        return sub;
    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(101);
        while (true) {
            System.out.println("猜数字");
            int y = scanner.nextInt();
            if (x > y) {
                System.out.println("猜小了");
            } else if (x < y) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}

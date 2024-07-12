package HomeWork;

import java.util.Arrays;

public class Day05 {
    public static void main(String[] args) {
        // 九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
            }
            System.out.println();
        }

        int[] arr_1 = new int[]{3, 2, 1};
        int[] arr_2;
        arr_2 = new int[]{3, 2, 1};
        int[] arr_3 = {3, 2, 1};
        int[] arr_4 = new int[3];
        System.out.println(arr_1[0]);
        for (int i = 0; i < arr_1.length; i++) {
            System.out.print(arr_1[i] + "\t");
        }
        System.out.println();
        arr_4 = Arrays.copyOf(arr_1, arr_1.length);
        System.out.println(Arrays.toString(arr_4));

        arr_2 = Arrays.copyOf(arr_2, arr_2.length + 1);
        int max = arr_2[0];
        for (int i = 0; i < arr_2.length; i++) {
            if (arr_2[i] > max) {
                max = arr_2[i];
            }
        }
        arr_2[arr_2.length - 1] = max;
        System.out.println(Arrays.toString(arr_2));

        Arrays.sort(arr_2);
        System.out.println(Arrays.toString(arr_2));
    }
}

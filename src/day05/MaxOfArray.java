package day05;

import www.day.temp.Quacked;

import java.util.Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        Quacked quacked = new Quacked();
        int[] arr = new int[(int) (Math.random() * 100 + 1)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }

        /*
        quacked.qui(arr, 0, arr.length - 1);
        int max = arr[arr.length - 1];

         */

        System.out.println("最大的数为：");
        System.out.println(max);
        System.out.println();

        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = max;

        // 输出数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();


        // 二维数组
        /*
        int[][] arr_2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr_2.length; i++) {
            for (int j = 0; j < arr_2[0].length; j++) {
                System.out.print(arr_2[i][j] + "\t");
            }
            System.out.println();
        }

         */
    }
}

package day05;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
        int[] a1 = new int[3];
        long[] a2 = new long[3];
        char[] a3 = new char[3];
        double[] a4 = new double[3];
        boolean[] b = new boolean[3];

        int[] arr_1 = new int[3];
        int[] arr_2 = {1, 2, 3};
        int[] arr_3 = new int[]{1, 2, 3};
        int[] arr_4;
        // arr_4 = {1, 2, 3}; Error
        arr_4 = new int[]{1, 2, 3};
        // arr_4[arr_4.length] = 4; Error

        System.out.println(arr_2[0]);
        System.out.println(arr_3[arr_3.length - 1]);

         */

        /*
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

         */

        int[] arr_1 = {1, 2, 3, 4, 5};
        int size = arr_1.length;
        int[] arr_2 = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        arr_1 = Arrays.copyOf(arr_1, arr_1.length + arr_2.length);
        System.arraycopy(arr_2, 0, arr_1, size, arr_2.length);
        for (int j : arr_1) {
            System.out.print(j);
            System.out.print("\t");
        }
        System.out.println();
    }
}

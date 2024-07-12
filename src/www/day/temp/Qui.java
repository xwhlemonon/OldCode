package www.day.temp;

import java.util.Arrays;
import java.util.Scanner;

public class Qui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quacked quacked = new Quacked();
        System.out.println("请输入待排序数字个数：");
        int num_ = scanner.nextInt();
        int[] arr = new int[num_];
        for (int i = 0; i < num_; i++) {
            System.out.println("请输入第" + (i + 1) + "个数：");
            arr[i] = scanner.nextInt();
        }
        quacked.qui(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

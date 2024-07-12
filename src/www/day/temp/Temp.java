package www.day.temp;

import java.util.Arrays;
import java.util.Scanner;

class Sort {
    private int[] num;

    public Sort(int[] temp) {
        num = temp;
    }

    private void sorted() {
        for (int i = 0; i < (num.length - 1); i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

    public int[] getNum() {
        sorted();
        return num;
    }
}

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int _num = scanner.nextInt();
        int[] arr = new int[_num];
        System.out.println("Enter these numbers: ");
        for (int i = 0; i < _num; i++) {
            arr[i] = scanner.nextInt();
        }
        Sort sort = new Sort(arr);
        System.out.println(Arrays.toString(sort.getNum()));
    }
}

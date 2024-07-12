package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Question_Day05_Ex {
    public void question_1() {
        int sub = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                sub += i;
            }
        }
        System.out.println("1-100的偶数和为：");
        System.out.println(sub);
    }

    public void question_2() {
        int num = 1;
        for (int i = 1; i <= 8; i++) {
            num *= i;
        }
        System.out.println("8的阶乘为：");
        System.out.println(num);
    }

    public void question_3() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void question_4() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        int[] arr_temp;
        arr_temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr_temp);
        System.out.println("最大值为：" + arr_temp[arr_temp.length - 1] + "\r\n最小值为：" + arr_temp[0]);
    }
}

public class Day05_Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question_Day05_Ex question = new Question_Day05_Ex();
        boolean flag = true;
        do {
            System.out.println("您要查看第几题：1、2、3、4；Other Key: Quit");
            switch (scanner.nextInt()) {
                case 1:
                    question.question_1();
                    break;
                case 2:
                    question.question_2();
                    break;
                case 3:
                    question.question_3();
                    break;
                case 4:
                    question.question_4();
                    break;

                default:
                    flag = false;
                    System.out.println("Quit");
            }
        } while (flag);
    }
}

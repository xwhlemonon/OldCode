package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Question_Day06_Ex {
    public void question_1() {
        Random random = new Random();
        int[] arr = new int[random.nextInt(6) + 5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }

    public void question_2() {
        Random random = new Random();
        int[] arr = new int[random.nextInt(6) + 5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}

public class Day06_Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question_Day06_Ex question = new Question_Day06_Ex();
        boolean flag = true;
        do {
            System.out.println("您要查看第几题：1、2；Other Key: Quit");
            switch (scanner.nextInt()) {
                case 1:
                    question.question_1();
                    break;
                case 2:
                    question.question_2();
                    break;
                default:
                    flag = false;
                    System.out.println("Quit");
            }
        } while (flag);
    }
}

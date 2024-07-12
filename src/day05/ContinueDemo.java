package day05;

import java.util.Scanner;

class Question_Day05_ContinueDemo {
    public void question_1() {
        for (int i = 1; i <= 9; i++) {
            if ((i % 3) != 0) {
                System.out.println(i + " * 9 = " + i * 9);
            }
        }
    }

    public void question_2() {
        for (int i = 1; i <= 9; i++) {
            if ((i % 3) == 0) {
                continue;
            }
            System.out.println(i + " * 9 = " + i * 9);
        }
    }

    public void question_3() {
        System.out.println("Null");
    }
}

public class ContinueDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question_Day05_ContinueDemo question = new Question_Day05_ContinueDemo();
        boolean flag = true;
        do {
            System.out.println("您要查看第几题：1、2、3；Other Key: Quit");
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
                default:
                    flag = false;
                    System.out.println("Quit");
            }
        } while (flag);
    }
}

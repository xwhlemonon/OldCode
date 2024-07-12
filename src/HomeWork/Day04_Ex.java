package HomeWork;

import java.util.Scanner;

class Question_Day04_Ex {
    public void question_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字判断正负和零：");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println('+');
        } else if (num < 0) {
            System.out.println('-');
        } else {
            System.out.println('0');
        }
    }

    public void question_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        System.out.println("请输入月份：");
        switch (scanner.nextInt()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("这个月31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("这个月30天");
                break;
            case 2:
                if ((year % 4) == 0) {
                    System.out.println("这个月29天");
                } else {
                    System.out.println("这个月28天");
                }
                break;
            default:
                System.out.println("输入错误");
        }
    }

    public void question_3() {
        int flag = 0;
        for (int i = 1900; i <= 2023; i++) {
            if ((i % 4) == 0) {
                System.out.print(i + " ");
                flag++;
                if (((flag % 10) == 0) && (flag != 0)) {
                    System.out.println();
                }
            }
        }
    }
}

public class Day04_Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question_Day04_Ex question = new Question_Day04_Ex();
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

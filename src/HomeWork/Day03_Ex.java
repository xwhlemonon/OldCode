package HomeWork;

import java.util.Scanner;

class Question_Day03_Ex {
    /**
     * 第一题
     */
    public void question_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.println((Math.max(a, b)) + " 更大");
        if (a > b) {
            System.out.println(a + " 更大");
        } else {
            System.out.println(b + " 更大");
        }
    }

    /**
     * 第二题
     */
    public void question_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        if ((year % 4) == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年是平年");
        }
    }

    /**
     * 第三题
     */
    public void question_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int mark = scanner.nextInt();
        if ((mark <= 100) && (mark >= 90)) {
            System.out.println("成绩等级：A");
        } else if ((mark < 90) && (mark >= 80)) {
            System.out.println("成绩等级：B");
        } else if ((mark < 80) && (mark >= 60)) {
            System.out.println("成绩等级：C");
        } else if ((mark < 60) && (mark >= 0)) {
            System.out.println("成绩等级：D");
        } else {
            System.out.println("成绩不合法");
        }
    }
}

public class Day03_Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question_Day03_Ex question = new Question_Day03_Ex();
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

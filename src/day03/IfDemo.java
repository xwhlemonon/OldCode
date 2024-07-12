package day03;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        boolean error = true;
        while (error) {
            Scanner scanner = new Scanner(System.in);
            double score = scanner.nextDouble();
            if ((score <= 100) && (score >= 90)) {
                System.out.println("优秀");
            } else if ((score < 90) && (score >= 60)) {
                System.out.println("良好");
            } else if ((score < 60) && (score >= 0)) {
                System.out.println("不及格");
            } else {
                System.out.println("ERROR_SYSTEM_WINDOWS");
                error = false;
            }
        }
    }
}

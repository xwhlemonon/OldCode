package HomeWork;

import java.util.Scanner;

public class Day04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("您需要干什么：1、取钱业务 2、存钱业务 3、退卡业务 4、其他业务");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("取钱业务...");
                break;
            case 2:
                System.out.println("存钱业务...");
                break;
            case 3:
                System.out.println("退卡业务...");
                break;
            case 4:
                System.out.println("其他业务...");
                break;
        }

        //--------
        System.out.println("猜数字1（1-1000）");
        int num1 = (int) (Math.random() * 1000 + 1);
        int num_1 = scanner.nextInt();
        while (num_1 != num1) {
            if (num_1 > num1) {
                System.out.println("大了");
            } else if (num_1 < num1) {
                System.out.println("小了");
            }
            num_1 = scanner.nextInt();

        }
        System.out.println("对了");

        //--------
        System.out.println("猜数字2（1-1000）");
        int num2 = (int) (Math.random() * 1000 + 1);
        int num_2;
        do {
            num_2 = scanner.nextInt();
            if (num_2 == num2) {
                System.out.println("对了");
            } else if (num_2 > num2) {
                System.out.println("大了");
            } else {
                System.out.println("小了");
            }
        } while (num_2 != num2);

        //--------
        for (int i = 0; i < 5; i++) {
            System.out.println("行动是成功的阶梯");
        }
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " * 9 = " + i * 9);
        }
        for (int i = 1; i <= 9; i += 2) {
            System.out.println(i + " * 9 = " + i * 9);
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(i + " * 9 = " + i * 9);
        }
        int sub = 0;
        for (int i = 1; i <= 100; i++) {
            sub += i;
        }
        System.out.println(sub);
    }
}

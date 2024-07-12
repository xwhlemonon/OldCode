package day03;

import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean _num = true;
        while (_num) {
            System.out.println("original cost: ");
            double money = scanner.nextDouble();
            if (money >= 2000) {
                money *= 0.5;
            } else if (money >= 1000) {
                money *= 0.7;
            } else if (money >= 500) {
                money *= 0.8;
            } else if (money >= 0) {
                money *= 0.9;
            } else {
                System.out.println("ERROR_SYSTEM_WINDOWS");
                _num = false;
            }
            if (_num) {
                System.out.println("You need to pay: " + money);
            }
            System.out.println();
        }
    }
}

package com.newrpg.play;

import com.newrpg.subclass.Drug;
import com.newrpg.subclass.RoleEmery;
import com.newrpg.subclass.RolePlayer;
import com.newrpg.superclass.Role;

import java.util.Random;
import java.util.Scanner;

public class Start {
    public static Role player = new RolePlayer();
    public static Role emery = new RoleEmery();
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static Drug drug = new Drug(2000);

    public static void main(String[] args) {
        while (judgeWhoDies() == (byte) 0) {
            start();
            playerAction();
            if (judgeWhoDies() == (byte) 1)
                break;
            emeryAction();
            actionEnd();
        }
        gameOver();
    }

    public static byte judgeWhoDies() {
        if (player.getHp() <= 0) {
            return (byte) 2;
        } else if (emery.getHp() <= 0) {
            return (byte) 1;
        } else {
            return (byte) 0;
        }
    }

    public static void start() {
        System.out.println();
        System.out.println("敌方生命值：" + emery.getHp() + "，玩家生命值：" + player.getHp());
        System.out.println("请选择：1、攻击；2、回复；");
    }

    public static void playerAction() {
        while (true) {
            int temp = scanner.nextInt();
            if (temp == 1) {
                player.attacked(emery);
                break;
            } else if (temp == 2) {
                ((RolePlayer) player).useDrug(drug);
                break;
            } else {
                System.out.println("Error");
            }
        }
    }

    public static void emeryAction() {
        emery.attacked(player);
    }

    public static void actionEnd() {
    }

    public static void gameOver() {
        if (judgeWhoDies() == 1) {
            System.out.println();
            System.out.println("你赢了");
        } else {
            System.out.println();
            System.out.println("你输了");
        }
        System.out.println();
        System.out.println("游戏结束");
    }
}

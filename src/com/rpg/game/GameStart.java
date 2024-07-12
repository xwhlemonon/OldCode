package com.rpg.game;

import com.rpg.port.Drug;
import com.rpg.port.Role;
import com.rpg.port.Role_Emery;
import com.rpg.port.Role_Player;

import java.util.Random;
import java.util.Scanner;

public class GameStart {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static Drug normalDrug = new Drug(30);
    public static Drug superDrug = new Drug(100);
    public static Role player = new Role_Player();
    public static Role emery = new Role_Emery();


    public static void main(String[] args) {
        System.out.println("欢迎来到RPG···");
        start();
    }

    public static void start() {
        while ((player.getHp() > 0) && (emery.getHp() > 0)) {
            aside();
            playTurn();
            emeTurn();
        }
        finish();
    }

    public static void aside() {
        System.out.println("敌方生命值：" + emery.getHp());
        System.out.println("玩家生命值：" + player.getHp());
        System.out.println("请选择：1、攻击；2、使用药物（" + player.getDrugNum() + "）");
    }

    public static void playTurn() {
        int temp = scanner.nextInt();
        if (temp == 1) {
            player.attackEnemy(emery);
            System.out.println();
        } else if (temp == 2) {
            int temp_1 = random.nextInt(10);
            if (temp_1 == 0) {
                System.out.println("你运气真好，这个药物是超级药物···");
                player.useDrug(superDrug);
            } else {
                player.useDrug(normalDrug);
            }
            System.out.println();
        } else {
            System.out.println("Error");
        }
    }

    public static void emeTurn() {
        emeUseDrug();
        emery.attackEnemy(player);
    }

    public static void emeUseDrug() {
        if (random.nextInt(10) == 0) {
            System.out.println("敌方使用了药物···");
            emery.useDrug(normalDrug);
            System.out.println();
        }
    }

    public static void finish() {
        if (player.getHp() <= 0) {
            System.out.println("你输了···");
        } else {
            System.out.println("你赢了···");
        }
    }
}

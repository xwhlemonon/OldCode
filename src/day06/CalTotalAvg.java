package day06;

import java.util.Arrays;
import java.util.Random;

public class CalTotalAvg {
    public static void main(String[] args) {
        int[] score = judgeScore();
        int[] scoreNoHeadNoTail = disScore(score);
        int scoreAvg = value(scoreNoHeadNoTail);
        System.out.println(scoreAvg);
    }

    public static int[] judgeScore() {
        Random random = new Random();
        int[] score = new int[random.nextInt(21) + 10];
        for (int i = 0; i < score.length; i++) {
            score[i] = random.nextInt(101);
        }
        return score;
    }

    public static int[] disScore(int[] arr) {
        int[] arrDis_1 = Arrays.copyOf(arr, arr.length);
        int[] arrDis_2 = new int[arr.length - 2];
        Arrays.sort(arrDis_1);
        arrDis_1 = Arrays.copyOf(arrDis_1, arrDis_1.length - 1);
        System.arraycopy(arrDis_1, 1, arrDis_2, 0, arrDis_2.length);
        return arrDis_2;
    }

    public static int value(int[] arr) {
        int sub = 0;
        for (int i : arr) {
            sub += i;
        }
        return sub / arr.length;
    }
}

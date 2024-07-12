package day04;

import java.util.Scanner;

class Guess {
    private final int num;
    private int guess_num;
    private boolean right;

    public Guess() {
        num = (int) (Math.random() * 1000 + 1);
    }

    public boolean rioted(){
        return this.right;
    }

    public boolean tress(int guess) {
        this.guess_num = guess;
        if (this.guess_num == this.num) {
            this.right = true;
            return true;
        } else {
            this.right = false;
            return false;
        }
    }

    public boolean dressed() {
        return this.guess_num > this.num;
    }
}

public class Guessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guess guess = new Guess();
        System.out.println("Number guessing game.(1~1000)");
        do {
            System.out.print("Your guess is ");
            if (guess.tress(scanner.nextInt())) {
                System.out.println("You guessed right.");
            } else if (guess.dressed()) {
                System.out.println("You guess big.");
            } else {
                System.out.println("You guess small.");
            }
        } while (!guess.rioted());
    }
}

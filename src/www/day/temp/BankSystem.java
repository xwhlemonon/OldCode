package www.day.temp;

import java.util.Scanner;

class Profit {
    private double capital;
    private double interest;

    public Profit(double temp) {
        capital = temp;
        compute();
    }

    public Profit() {
        capital = 0;
        interest = 0;
    }

    private void compute() {
        interest = capital * 0.12;
    }

    public void setCapital(double temp) {
        capital = temp;
        compute();
    }

    public double getCapital() {
        return interest;
    }

    public double getInterest() {
        return interest;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the principal.");
        Profit profit = new Profit(scanner.nextDouble());
        System.out.print("Your interest will be ");
        System.out.println(profit.getInterest());
    }
}

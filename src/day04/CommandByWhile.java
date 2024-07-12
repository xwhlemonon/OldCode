package day04;

public class CommandByWhile {
    public static void main(String[] args) {
        /*
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * 9 = " + i * 9);
        }
         */

        /*
        int facter = 1;
        while (facter < 10) {
            System.out.println(facter + " * 9 = " + facter * 9);
            facter++;
        }
         */

        int facter_ = 1;
        do {
            System.out.println(facter_ + " * 9 = " + facter_ * 9);
            facter_++;
        } while (facter_ < 10);
    }
}

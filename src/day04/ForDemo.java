package day04;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 9; j >= i; j--) {
                if ((i * j) / 10 > 0) {
                    System.out.print("    " + i * j);
                } else {
                    System.out.print("     " + i * j);
                }
            }
            System.out.println();
        }
        int sun = 0;
        for (int i = 1; i <= 1000; i++) {
            sun += i;
        }
        System.out.println(sun);
    }
}

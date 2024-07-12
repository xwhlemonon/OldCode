package day05;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i % 15) == 0) {
                break;
            }
        }
    }
}

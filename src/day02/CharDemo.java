package day02;

public class CharDemo {
    public static void main(String[] args) {
        pinch();
        char[] c1 = {'你', '好', '憨', '头', '包'};
        for (int i = 0; i <= 4; i++)
            System.out.print(c1[i]);
        System.out.println();
        char c2  = '\\';
        System.out.println(c2);
    }

    public static void pinch(){
        int num = '0';
        for (int i = 15; i >= 0; i--) {
            if (((num >> i) & 1) == 1) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}

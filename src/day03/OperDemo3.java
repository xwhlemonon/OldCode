package day03;

public class OperDemo3 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.println((a > b) && (b < c));
        System.out.println((a > b) || (b < c));
        System.out.println(!(a > b));
        System.out.println((a != b) && (!(a == b)));
        System.out.println((a > b) || (a++ > b));
        System.out.println(a);
        System.out.println(--a == a++);

        short s = 5;
        //s = s + 10; //s = (short) (s + 10)
        s += 10;
    }
}

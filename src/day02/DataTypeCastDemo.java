package day02;

public class DataTypeCastDemo {
    public static void main(String[] args) {
        long b = 5;
        int c = (int) b;
        pin(c);

        double e = 5;
        System.out.println(e);

        long f = 10000000000L;
        int g = (int) f;
        pin(g);

        double h = 25.923;
        int i = (int) h;
        pin(i);

        byte a1 = 5;
        byte a2 = 6;
        byte a3 = (byte) (a1 + a2);
        System.out.println(a3);
        pin(a3);
        System.out.println((char) ('2'+'2'));
    }

    public static void pin(int temp){
        System.out.println(temp);
    }
}

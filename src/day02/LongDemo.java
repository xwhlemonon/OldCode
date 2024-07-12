package day02;

public class LongDemo {
    public static void main(String[] args) {
        long a = 1000000000*2*10L;
        long b = 1000000000*3*10L;
        long c = 1000000000L*3*10;
        print(a);
        print(b);
        print(c);
    }

    public  static void print(long temp){
        System.out.println(temp);
    }
}

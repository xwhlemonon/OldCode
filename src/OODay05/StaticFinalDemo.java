package OODay05;

public class StaticFinalDemo {
    public static void main(String[] args) {
        System.out.println(Loo.PI);
    }
}

class Loo {
    public static final double PI;

    static {
        PI = 3.141592653579893;
    }
}

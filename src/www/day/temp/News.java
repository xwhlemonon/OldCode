package www.day.temp;

public class News {
    public static void main(String[] args) {
        Aoo aoo = new Aoo(5);
    }
}

class Aoo {
    public Aoo() {
        System.out.println("无");
    }

    public Aoo(int a) {
        this();
        System.out.println("有");
    }
}

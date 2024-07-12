package OODay05;

public class StaticVer {
    int a;
    static int b;

    public StaticVer() {
        a++;
        b++;
    }

    public void show() {
        System.out.println(a + " and " + b);
    }
}

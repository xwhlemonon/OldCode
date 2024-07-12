package OODay05;

public class StaticDemo {
    public static void main(String[] args) {
        StaticVer o1 = new StaticVer();
        o1.show();
        System.out.println(StaticVer.b);
        StaticVer o2 = new StaticVer();
        o2.show();
        StaticVer o3 = new StaticVer();
        o3.show();

        StaticBlock o4 = new StaticBlock();
        StaticBlock o5 = new StaticBlock();
        StaticBlock o6 = new StaticBlock();

        StaticMethod.test();
    }
}

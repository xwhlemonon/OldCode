package OODay05;

/**
 * 静态块
 */
public class StaticBlock {
    static {
        System.out.println("静态");
        int i;
    }

    public StaticBlock() {
        System.out.println("构造");
    }
}

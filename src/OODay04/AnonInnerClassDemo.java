package OODay04;

public class AnonInnerClassDemo {
    public static void main(String[] args) {
        //创建Inter的匿名子类
        //将匿名子类实例化，向上造型为Inter类型
        Inter o1 = new Inter() {
        };

        int num = 5;
        num = 10;
        InterInter o2 = new InterInter() {
            @Override
            public void show() {
                System.out.println();
            }
        };

        o2.show();
    }
}

interface Inter {
}

interface InterInter {
    void show();
}

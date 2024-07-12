package HomeWork.OoDay04.OODay04_2;

public class AnonInnerClassDemo {
    public static void main(String[] args) {
        Inter inter = new Inter() {
        };

        InterInter interInter = new InterInter() {
            @Override
            public void show() {
                System.out.println("你好");
            }
        };

        interInter.show();
    }
}

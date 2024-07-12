package day06;

public class MethodDemo {
    public static void main(String[] args) {
        sayHello("张力", 24);
    }

    public static void sayHello(String name, int age) {
        System.out.print("大家好，我叫");
        System.out.print(name);
        System.out.print("，喜欢唱、跳、rap、篮球。");
        System.out.println();
        System.out.print(age);
        System.out.print("岁，是练习生。");
        System.out.println();
    }
}

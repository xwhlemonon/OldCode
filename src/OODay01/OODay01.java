package OODay01;

import java.util.Scanner;

class Student {
    public String name;
    public int age;
    public String className;
    public String stuId;

    public Student() {
    }

    public Student(String name, int age, String className, String stuId) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }

    public void study() {
        System.out.println("学习中···");
    }

    public void sayHi() {
        System.out.println("大家好，我是" + this.age + "岁的" + this.name + "，班级为：" + this.className + "，学号为：" + this.stuId);
    }

    public void playWith(String anotherName) {
        System.out.println("我在和" + anotherName + "一起玩···");
    }
}

class CarTest {
    public String brand;
    public String color;
    public int price;

    public CarTest() {
    }

    public CarTest(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void start() {
        System.out.println(this.price + "元的" + this.color + "色" + this.brand + "牌汽车启动");
    }

    public void run() {
        System.out.println("跑起来");
    }

    public void stop() {
        System.out.println("停停停");
    }
}

class Question_OODay01 {
    public void question_1() {
        Student student = new Student("熊文浩", 24, "jdk21", "2024");
        student.study();
        student.sayHi();
        student.playWith("张力");
    }

    public void question_2() {
        CarTest carTest = new CarTest("五菱宏光", "黑", 10000);
        carTest.start();
        carTest.run();
        carTest.stop();
    }
}

public class OODay01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question_OODay01 question = new Question_OODay01();
        boolean flag = true;
        do {
            System.out.println("您要查看第几题：1、2；Other Key: Quit");
            switch (scanner.nextInt()) {
                case 1:
                    question.question_1();
                    break;
                case 2:
                    question.question_2();
                    break;
                default:
                    flag = false;
                    System.out.println("Quit");
            }
        } while (flag);
    }
}

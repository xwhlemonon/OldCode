package OODay02;

public class Person {
    protected String name;
    protected char sex;
    protected int age;

    Person() {
        name = "无名氏";
        sex = '?';
        age = 0;
    }

    Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void hello() {
        System.out.println("我是" + name + "，我是" + sex + "的，我" + age + "岁了···");
    }

    void eatFood() {
        System.out.println("需要吃东西···");
    }

    void sleep() {
        System.out.println("需要睡觉···");
    }

    void work() {
    }

    void salary() {
    }
}

package HomeWork.OoDay02.OODay02_1;

public class Person {
    public String name;
    public int age;
    public String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void eat() {
        System.out.println("我是家住" + address + "的" + age + "岁的" + name + "在吃东西···");
    }

    public void sleep() {
        System.out.println("我是家住" + address + "的" + age + "岁的" + name + "在睡觉···");
    }

    public void sayHi() {
        System.out.println("我是家住" + address + "的" + age + "岁的" + name + "在睡觉···");
    }
}

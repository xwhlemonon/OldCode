package HomeWork.OoDay02.OODay02_2;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age + "岁" + color + "色的狗" + name + "在吃肉");
    }

    public void lookHome() {
        System.out.println(age + "岁" + color + "色的狗" + name + "在看家");
    }
}

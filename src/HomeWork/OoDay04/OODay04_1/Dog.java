package HomeWork.OoDay04.OODay04_1;

public class Dog extends Animal implements Swim {
    public Dog() {
        super();
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age + "岁" + color + "色的狗、" + name + "在吃肉");
    }

    @Override
    public void swim() {
        System.out.println(age + "岁" + color + "色的狗、" + name + "在游泳");
    }

    public void lookHome() {
        System.out.println(age + "岁" + color + "色的狗、" + name + "在看家");
    }
}

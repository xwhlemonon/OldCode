package HomeWork.OoDay03.OODay03_1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, double age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age + "岁的" + color + "色的" + name + "在吃肉");
    }

    @Override
    public void swim() {
        System.out.println(age + "岁的" + color + "色的" + name + "在游泳");
    }

    public void lookHome() {
        System.out.println(age + "岁的" + color + "色的" + name + "在看家");
    }
}

package HomeWork.OoDay02.OODay02_2;

public class Fish extends Animal {
    public Fish() {
        super();
    }

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age + "岁" + color + "色的鱼" + name + "在吃面包");
    }
}

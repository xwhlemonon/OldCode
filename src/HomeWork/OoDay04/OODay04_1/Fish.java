package HomeWork.OoDay04.OODay04_1;

public class Fish extends Animal implements Swim {
    public Fish() {
        super();
    }

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age + "岁" + color + "色的鱼、" + name + "在吃鱼饵");
    }

    @Override
    public void swim() {
        System.out.println(age + "岁" + color + "色的鱼、" + name + "在游泳");
    }
}

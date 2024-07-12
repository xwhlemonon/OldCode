package OODay03;

public class Fish extends Animal implements Swimming {
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

    @Override
    public void swimming() {
        System.out.println(name + "会游泳");
    }
}

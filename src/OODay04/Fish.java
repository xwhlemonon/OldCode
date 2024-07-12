package OODay04;

/**
 * 鱼类
 */
public class Fish extends Animal implements Swim {
    public Fish() {
        super();
    }

    public Fish(String name, double age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age + "岁" + color + "色的鱼，" + name + "在吃面包");
    }

    @Override
    public void swim() {
        System.out.println(name + "会游泳");
    }
}

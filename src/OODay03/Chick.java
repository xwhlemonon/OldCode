package OODay03;

public class Chick extends Animal implements Swimming {
    public Chick() {
        super();
    }

    public Chick(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age + "岁" + color + "色的鸡" + name + "在吃米");
    }

    public void layEggs() {
        System.out.println(age + "岁" + color + "色的鸡" + name + "在下蛋");
    }

    @Override
    public void swimming() {

    }
}

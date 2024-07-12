package HomeWork.OoDay03.OODay03_1;

public class Chick extends Animal {
    public Chick() {
    }

    public Chick(String name, double age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age + "岁的" + color + "色的" + name + "在吃米");
    }

    public void layEggs() {
        System.out.println(age + "岁的" + color + "色的" + name + "在下蛋");
    }
}

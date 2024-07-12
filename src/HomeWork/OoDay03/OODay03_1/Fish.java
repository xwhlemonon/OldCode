package HomeWork.OoDay03.OODay03_1;

public class Fish extends Animal implements Swim {
    public Fish() {
    }

    public Fish(String name, double age, String color) {
        super(name, age, color);
    }


    @Override
    public void eat() {
        System.out.println(age + "岁的" + color + "色的" + name + "在吃虫");
    }

    @Override
    public void swim() {
        System.out.println(age + "岁的" + color + "色的" + name + "在游泳");
    }
}

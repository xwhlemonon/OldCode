package OODay04;

/**
 * 狗类
 */
public class Dog extends Animal implements Swim {
    public Dog() {
        super();
    }

    public Dog(String name, double age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age + "岁" + color + "色的狗，" + name + "在吃肉");
    }

    public void lookHome() {
        System.out.println(age + "岁" + color + "色的狗，" + name + "在看家");
    }

    @Override
    public void swim() {
        System.out.println(name + "会游泳");
    }
}

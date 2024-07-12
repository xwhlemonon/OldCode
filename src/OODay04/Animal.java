package OODay04;

/**
 * 动物类
 */
public abstract class Animal {
    public String name;
    public double age;
    public String color;

    public Animal() {
    }

    public Animal(String name, double age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void drink() {
        System.out.println(age + "岁" + color + "色的" + name + "在喝水");
    }

    public abstract void eat();
}

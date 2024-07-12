package OODay03;

public abstract class Animal implements Eat {
    public String name;
    public int age;
    public String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void drink() {
        System.out.println(age + "岁" + color + "色的" + name + "在喝水");
    }
}

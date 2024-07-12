package HomeWork.OoDay04.OODay04_1;

public class PolymorphicDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("茧哥", 2, "紫"),
                new Chick("坤哥", 25, "黑白"),
                new Fish("鱼哥", 1, "红")
        };
        Master master = new Master();
        for (Animal animal : animals) {
            System.out.println(animal.name);
            animal.eat();
            animal.drink();
            if (animal instanceof Dog) {
                ((Dog) animal).lookHome();
            } else if (animal instanceof Chick) {
                ((Chick) animal).layEggs();
            } else if (animal instanceof Swim) {
                ((Swim) animal).swim();
            }
            master.feed(animal);
        }
    }
}

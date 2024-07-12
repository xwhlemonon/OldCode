package OODay04;

import java.util.Random;

public class PolymorphicDemo {
    public static void main(String[] args) {
        /*
        Dog dog = new Dog("狗哥", 1, "黄");
        Chick chick = new Chick("坤哥", 2.5, "黑白");
        Fish fish = new Fish("鱼哥", 1.5, "紫");
        eat(dog);
        eat(chick);
        eat(fish);
        Master master = new Master();
        master.feed(dog);
        master.feed(chick);
        master.feed(fish);
         */

        Animal[] animals = new Animal[3];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = randomAnimal();
        }

        for (Animal temp : animals) {
            if (temp instanceof Dog) {
                ((Dog) temp).lookHome();
            } else if (temp instanceof Chick) {
                ((Chick) temp).layEggs();
            } else {
                ((Fish) temp).swim();
            }
        }
    }

    public static void eat(Animal animal) {
        animal.eat();
    }

    public static Animal randomAnimal() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                return new Dog("狗哥", ((int) (random.nextDouble() * 50.0 + 1.0)) / 10.0, "黄");
            case 1:
                return new Fish("鱼哥", ((int) (random.nextDouble() * 50.0 + 1.0)) / 10.0, "紫");
            case 2:
                return new Chick("坤哥", ((int) (random.nextDouble() * 50.0 + 1.0)) / 10.0, "黑白");
            default:
                return null;
        }
    }
}
